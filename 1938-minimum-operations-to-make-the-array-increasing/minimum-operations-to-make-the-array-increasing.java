class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                int adding=nums[i-1]-nums[i]+1;
                nums[i]+=adding;
                c+=adding;
            }
        }
        return c;
    }
}