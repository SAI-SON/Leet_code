class Solution {
    public int maxProfit(int[] prices) {
        // if(prices.length<1) return 0;
        int minpro=Integer.MAX_VALUE;
        int maxpro=0;
        for(int i=0;i<prices.length;i++){
            if(minpro>prices[i]){
                minpro=prices[i]; 
            }
             if(prices[i]-minpro>maxpro){
                    maxpro=prices[i]-minpro;
                }
        }
        return maxpro;
    }
}