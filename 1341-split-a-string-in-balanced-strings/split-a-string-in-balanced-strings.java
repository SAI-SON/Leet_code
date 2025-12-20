class Solution {
    public int balancedStringSplit(String s) {
        int n=0;
        int r=0,l=0;
        for(char c:s.toCharArray()){
            if (c=='R')
            r++;
            if(c=='L')
            l++;
            if(r==l) n++;
        }
        return n;
    }
}