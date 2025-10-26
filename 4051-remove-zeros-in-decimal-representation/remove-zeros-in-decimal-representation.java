class Solution {
    public long removeZeros(long n) {
        String str=String.valueOf(n);
        String s="";
        for(char c:str.toCharArray()){
            if(c!='0')
            s+=String.valueOf(c);
        }
        return Long.valueOf(s);
    }
}