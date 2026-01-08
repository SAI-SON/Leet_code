class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd((int)Math.pow(n,2),n*(n+1));
    }
}