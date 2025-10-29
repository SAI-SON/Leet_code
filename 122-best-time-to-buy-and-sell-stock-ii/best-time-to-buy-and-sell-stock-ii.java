class Solution {
    public int maxProfit(int[] prices) {
        int first=prices[0],m=0;
        for(int i=1;i<prices.length;i++){
            if(first<prices[i]) m+=prices[i]-first;
            first=prices[i];
        }
        return m;
    }
}