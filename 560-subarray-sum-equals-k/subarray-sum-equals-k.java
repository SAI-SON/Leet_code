class Solution {
    public int subarraySum(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int s=0;
            int j=i;
            while(j<nums.length){
               s+=nums[j];
               if(s==k){
                c++;
                //  break;
               }
               j++;
            }
       
         }
            return c;
    }
}