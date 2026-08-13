class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long a=nums[i];
                long b=nums[j];
                long g=gcd(a,b);
                long st=(a/g)*(b/g);
                if(st>max){
                    max=st;
                }
            }
        }
        return max;
    }
    public static long gcd(long a,long b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}