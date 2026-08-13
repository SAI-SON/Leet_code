class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        double ans=0.0;
        int pi=prices.length-1;
        int di=discounts.length-1;
        while(pi>=0 && di>=0){
            ans+=(((double)prices[pi])*(100.00-(double)discounts[di]))/100.00;
            // System.out.println(ans+" "+discounts[di]+" "+prices[pi]);
            pi--;
            di--;
        }
        while(pi>=0){
            ans+=prices[pi];
            pi--;
        }
        return ans;
    }
}