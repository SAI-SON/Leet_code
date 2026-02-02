class Solution {
    public int minimumCost(int[] nums) {
        int first=nums[0];
        // int num1=Integer.MAX_VALUE,nums2=Integer.MAX_Value;
        int arr[]=Arrays.copyOfRange(nums, 1, nums.length);
        Arrays.sort(arr);
        return first+arr[0]+arr[1];
    }
}