class Solution {
    public int minMoves(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int ans=0;
        for(int i:nums){
            ans+=Math.abs(i-max);
        }
        return ans;
    }
}