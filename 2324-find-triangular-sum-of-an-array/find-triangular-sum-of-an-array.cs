public class Solution {
    public int TriangularSum(int[] nums) {
        int k=0;
        while(k<nums.Length){
            for(int i=1;i<nums.Length-k;i++){
                nums[i-1]=(nums[i]+nums[i-1])%10;
            }
            k++;
        }
        return nums[0];
    }
}