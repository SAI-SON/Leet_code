class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int min=0,max=0,maxsum=0,minsum=0;
        for(int num:nums){
            maxsum+=num;
            minsum+=num;
            max=Math.max(max,maxsum);
            min=Math.min(min,minsum);
            if(maxsum<0) maxsum=0;
            if(minsum>0) minsum=0;
        }
        return Math.max(max,Math.abs(min));
    }
}