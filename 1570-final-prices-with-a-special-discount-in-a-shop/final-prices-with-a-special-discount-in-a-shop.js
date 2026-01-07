/**
 * @param {number[]} prices
 * @return {number[]}
 */
var finalPrices = function(prices) {
    let res=[...prices];
    for(let i=0;i<prices.length;i++){
        res[i]=prices[i];
        for(let j=i+1;j<prices.length;j++){
            if(prices[i]>=prices[j]){
                res[i]=prices[i]-prices[j];
                break;
            }
        }
    }
    return res;
};