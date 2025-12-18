class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left=0;
        for(int i=0;i<nums.length;i++){
            if((nums[i]&1)==0){
            int temp=nums[left];
            nums[left]=nums[i];
            nums[i]=temp;
            left++;
            }
        }
        return nums;
    }
}