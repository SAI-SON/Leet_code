class Solution {
    public long splitArray(int[] nums) {
        int arr[]=new int[nums.length+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i*i<=nums.length;i++){
            if(arr[i]==0){
                for(int j=i*i;j<=nums.length;j+=i){
                    arr[j]=1;
                }
            }
        }
        long primesum=0;
        long nonprimesum=0;
        for(int i=0;i<nums.length;i++){
            if(arr[i]==1){
                nonprimesum+=nums[i];
            }
            else{
                primesum+=nums[i];
            }
        }
        return Math.abs(nonprimesum-primesum);
    }
}