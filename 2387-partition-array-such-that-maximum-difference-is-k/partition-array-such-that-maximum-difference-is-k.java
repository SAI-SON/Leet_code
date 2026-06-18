class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int partition=1;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]-nums[s]>k){
                partition++;
                s=i;
            }
        }
        return partition;
    }
}