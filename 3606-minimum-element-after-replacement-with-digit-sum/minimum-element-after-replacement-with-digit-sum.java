class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=add(nums[i]);
        }
        return Arrays.stream(nums).min().getAsInt();
    }
    public static int add(int n){
        int ad=0;
        while(n>0){
            ad+=n%10;
            n/=10;
        }
        return ad;
    }
}