class Solution {
    public int maximumLengthSubstring(String s) {
        int []fre=new int[26];
        int left=0;
        int right=0;
        int max=Integer.MIN_VALUE;
        while(right<s.length() && left <= right){
            char c=s.charAt(right);
            fre[c-'a']++;
            while(left<s.length() && fre[c-'a']>2){
                fre[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max,right-left+1);
            right++;
        }
        return max;
    }

}