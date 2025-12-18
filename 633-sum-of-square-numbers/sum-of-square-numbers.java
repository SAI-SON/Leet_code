class Solution {
    public boolean judgeSquareSum(int c) {
        for(long i=0;i*i<=c;i++){
            double k=Math.sqrt(c-(i*i));
            if(k==(int)k) return true;
        }
        return false;
    }
}