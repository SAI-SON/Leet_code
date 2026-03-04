class Solution {
    public int smallestEqual(int[] nums) {
        int size=nums.length;
        for(int i=0;i<size;i++){
            if((i%10)==nums[i])
            return i;
        }
        return -1;
    }
}