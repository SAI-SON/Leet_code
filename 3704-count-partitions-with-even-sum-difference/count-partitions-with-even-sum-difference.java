class Solution {
    public int countPartitions(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int pre=0,c=0;
        for(int i=0;i<nums.length-1;i++){
            pre+=nums[i];
            sum-=nums[i];
            int res=pre-sum;
            if((res&1)==0) c++;
        }
        return c;
    }
}