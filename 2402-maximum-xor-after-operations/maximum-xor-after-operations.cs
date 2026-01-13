public class Solution {
    public int MaximumXOR(int[] nums) {
       int r=0;
       for(int i=0;i<nums.Length;i++){
        r|=nums[i];
       } 
       return r;
    }
}