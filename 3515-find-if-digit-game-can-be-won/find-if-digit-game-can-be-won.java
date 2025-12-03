class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1,sum2;
        sum1=sum2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<10) sum1+=nums[i];
            else sum2+=nums[i];
        }
        return sum1!=sum2;
    }
}