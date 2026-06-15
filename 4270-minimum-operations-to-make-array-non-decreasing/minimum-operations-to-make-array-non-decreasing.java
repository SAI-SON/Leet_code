class Solution {
    public long minOperations(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                sum+=nums[i]-nums[i+1];
            }
        }
        return sum;
    }
}