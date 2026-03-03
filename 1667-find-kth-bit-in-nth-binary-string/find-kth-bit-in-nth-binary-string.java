class Solution {
    public char findKthBit(int n, int k) {
        StringBuffer sb=new StringBuffer("0");
        for(int i=1;i<n;i++){
            StringBuffer t=new StringBuffer();
            for(int j=0;j<sb.length();j++){
                t.append(sb.charAt(j)=='0'?'1':'0');
            }
            t.reverse();
            sb.append("1").append(t);
        }
        return sb.charAt(k-1);
    }
}