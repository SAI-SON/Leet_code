class Solution {
    public int findFinalValue(int[] nums, int original) {
        if(!search(nums,original)){
            return original;
        }
        int s=0;
        int o=original;
        while(search(nums,o)){
            o=o*2;
        }
        return o;
    }
    public static boolean search(int num[],int target){
        for(int i:num){
            if(i==target){
                return true;
            }
        }
        return false;
    }
}