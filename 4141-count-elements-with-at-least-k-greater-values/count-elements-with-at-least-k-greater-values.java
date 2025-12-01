class Solution {
    public int countElements(int[] nums, int k) {
         if(k<1) return nums.length;
        Arrays.sort(nums);
        int c=0;
        int value=nums[nums.length-k];
        for(int i=0;i<nums.length;i++){
            if(value>nums[i]){
                c++;
            }
        }
        return c;
    }
}