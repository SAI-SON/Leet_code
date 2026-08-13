class Solution {
    public String optimalDivision(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0]+"";
        if(n==2) return nums[0]+"/"+nums[1];

        String str=nums[0]+"/(";
        for(int i=1;i<n;i++){
            str+=nums[i];
            if(i!=n-1) str+="/";
        }
        return str+")";
    }
}