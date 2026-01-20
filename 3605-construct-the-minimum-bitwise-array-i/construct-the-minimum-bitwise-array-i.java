class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int arr[]=new int[nums.size()];
        int k=0;
        for(int i:nums){
            int t=-1;
            for(int j=1;j<i;j++){
            if((j|(j+1))==i){
                t=j;
                break;
            }
            }
        arr[k++]=t;
        }
        return arr;
    }
}