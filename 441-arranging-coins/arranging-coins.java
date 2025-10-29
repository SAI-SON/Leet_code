class Solution {
    public int arrangeCoins(int n) {
        int c=n;
        for(int i=1;i<=n;i++)
        {
            if(c-i>=0) c-=i;
            else return i-1;
        }
        return 1;
    }
}