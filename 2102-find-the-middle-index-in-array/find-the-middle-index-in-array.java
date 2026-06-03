class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int before=0;
        int after=sum;
        int size=nums.length;
        for(int i=0;i<size;i++){
            int val=nums[i];
            after-=val;
            if(after==before) return i;
            before+=val;
        }
        return -1;
    }
}