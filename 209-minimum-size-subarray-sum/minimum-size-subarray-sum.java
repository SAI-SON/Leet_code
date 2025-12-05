class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,len=Integer.MAX_VALUE;
        for(int i=0,k=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                len=Math.min(i-k+1,len);
                sum-=nums[k++];
            }
            // if(sum==target){
            //     len=Math.min(i-k+1,len);

            // }
        }
        
        return (len==Integer.MAX_VALUE)?0:len;
    }
}