class Solution {
    public String smallestSubsequence(String s) {
        int fre[]=new int[26];
        for(char c:s.toCharArray()){
            fre[c-'a']++;
        }
        boolean visit[]=new boolean[26];
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            fre[c-'a']--;
            if(visit[c-'a']){
                continue;
            }
            while(sb.length()>0){
                char top=sb.charAt(sb.length()-1);
                if(c<top && fre[top-'a']>0){
                    sb.deleteCharAt(sb.length()-1);
                    visit[top-'a']=false;
                }
                else{
                    break;
                }
            }
            sb.append(c);
            // System.out.println(sb.toString());
            visit[c-'a']=true;
        }
        return sb.toString();
    }
}