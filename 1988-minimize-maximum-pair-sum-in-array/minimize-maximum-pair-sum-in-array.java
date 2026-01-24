class Solution {
    public int minPairSum(int[] nums) {
        int n=nums.length,max=0;
        Arrays.sort(nums);
        int i=0,j=n-1;
        while(i<j){
            max=Math.max(max,nums[i]+nums[j]);
            j--;
            i++;
        }
        return max;
    }
}