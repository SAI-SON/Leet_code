class Solution {
    public int divide(int dividend, int divisor) {
        int k=Integer.MAX_VALUE;
        if( divisor == 1 ) return dividend;
        int res = dividend / divisor;
        if(-k>res) return k;
        else if(k<res) return k-1;

        return res;
    }
}