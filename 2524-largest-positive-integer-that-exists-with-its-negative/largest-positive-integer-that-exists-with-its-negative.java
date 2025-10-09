class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            int target=nums[i]*-1;
            if(check(nums,target)){
               return nums[i];
            }
        }
        return -1;
    }
    public static boolean check(int nums[],int target){
        int start=0,end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return true;
            }
            if(nums[mid]<target){
                start=mid+1;
            }
            else
             end=mid-1;
        }
        return false;
    }
}