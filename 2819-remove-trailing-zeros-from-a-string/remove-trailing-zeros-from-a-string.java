class Solution {
    public String removeTrailingZeros(String num) {
        StringBuffer sb=new StringBuffer(num);
        int len=sb.length();
        while(sb.charAt(len-1)=='0'){
            sb.deleteCharAt(len-1);
            len--;
        }
        return sb.toString();
    }
}