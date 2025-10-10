class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        // Arrays.sort(words,(a,b)->b.length()-a.length());
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                // System.out.println()
                if(check(words[i],words[j],max)){
                    // if(max<words[i].length()*words[j].length())
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
            return max;
    }
    public static boolean check(String s1,String s2, int max){
        for(char c:s2.toCharArray()){
            if(max<s1.length()*s2.length()){
            if(s1.contains(String.valueOf(c))){
                // System.out.println(s1+ " " +s2+" "+c+" "+max);
                return false;
            }
            }
        }
        return true;
    }
}