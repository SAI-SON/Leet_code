class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;c+=(nums[i]%3!=0)?1:0,i++);
        return c;
    }
}