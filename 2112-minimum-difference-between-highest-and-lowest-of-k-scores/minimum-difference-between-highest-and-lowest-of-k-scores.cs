public class Solution {
    public int MinimumDifference(int[] nums, int k) {
        Array.Sort(nums);
        int min=int.MaxValue;
        for(int i=0;i<nums.Length-k+1;i++){
            min=Math.Min(min,nums[i+k-1]-nums[i]);
        }
        return min;
    }
}