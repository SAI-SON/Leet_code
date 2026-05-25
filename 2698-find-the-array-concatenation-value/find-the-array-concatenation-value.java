class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int len=nums.length;
        long add=0;
        for(int i=0;i<len/2;i++){
            int power=(int)Math.pow(10,Math.floor(Math.log10(nums[len-i-1]))+1);
            System.out.println(power);
            add+=nums[i]*power+nums[len-i-1];
            System.out.println(add);
        }
        if((len&1)==1){
            add+=nums[(len/2)];
        }
        return add;
    }
}