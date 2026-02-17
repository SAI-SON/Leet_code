class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int max = findMax(nums[i]);
            int n=String.valueOf(nums[i]).length();
            
            nums[i]=Integer.valueOf(String.valueOf(max).repeat(n));
        }
        return Arrays.stream(nums).sum();
    }
    public int findMax(int n){
        int max=0;
        while(n!=0){
            int rem=n%10;
            max=Math.max(rem,max);
            n=n/10;
        }
        return max;
    }
}