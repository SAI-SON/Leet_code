class Solution {
    public int findKthLargest(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length-k+1;i++){
        //     max=Math(max,checkMax(i,i+k,nums));
        // }
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    // public static int checkMax(int start,int end;int[] nums){
    //     int max=Integer.MIN_VALUE;
    //     for(int i=start;i<end;i++){

    //     }
    // }
}