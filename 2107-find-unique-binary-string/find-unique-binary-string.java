class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String str="";
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(i)=='1'){
                str+='0';
            }
            else{
                str+='1';
            }
        }
        return str;
    }
}