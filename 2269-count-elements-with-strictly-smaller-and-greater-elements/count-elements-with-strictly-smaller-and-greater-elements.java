class Solution {
    public int countElements(int[] nums) {
        int count=0;
        int mn=Arrays.stream(nums).min().getAsInt();
        int mx=Arrays.stream(nums).max().getAsInt();
        for(int i:nums){
            if(mn<i && mx>i){
                count++;
            }
        }
        return count;
    }
}