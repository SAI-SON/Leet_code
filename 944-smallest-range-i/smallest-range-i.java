class Solution {
    public int smallestRangeI(int[] nums, int k) {
       
        int min=Arrays.stream(nums).min().getAsInt();
        int max=Arrays.stream(nums).max().getAsInt();
    
        return (max-k)-(min+k)<0?0:(max-k)-(min+k);
    }
}