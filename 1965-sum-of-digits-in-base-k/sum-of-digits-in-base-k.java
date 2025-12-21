class Solution {
    public int sumBase(int n, int k) {
        // String str=Integer.toString(n,k);
        // n=Integer.valueOf(str);
        int sum=0;
        while(n>0){
            sum+=n%k;
            n/=k;
        }
        System.out.println(sum);
        // return sum%9==0?9:sum%9;
        return sum;
    }
}