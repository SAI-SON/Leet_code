class Solution {
    public boolean isGood(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int len = nums.length;
        if(len != max+1 )
        return false;

        int fre[]=new int[len+1];

        for(int x : nums){
            if( x < 1 || x > max ) return false;
            fre[x]++;
            if((x==max && fre[x] >2 ) || (x!=max && fre[x]>1)) return false;

        }
        return fre[max]==2;
    }
}