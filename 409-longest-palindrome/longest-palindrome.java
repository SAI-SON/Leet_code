class Solution {
    public int longestPalindrome(String s) {
        int singleDigit=0;
        Map<Character,Integer>map= new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            if(map.get(c)%2==1) singleDigit++;
            else singleDigit--;
        }
        return singleDigit>1?s.length()-singleDigit+1:s.length();
    }
}