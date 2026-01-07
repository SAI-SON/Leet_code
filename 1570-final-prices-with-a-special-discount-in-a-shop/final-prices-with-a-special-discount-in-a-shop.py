class Solution(object):
    def finalPrices(self, prices):
        """
        :type prices: List[int]
        :rtype: List[int]
        """
        res=[0]*len(prices)
        for i in range(len(prices)):
            res[i]=prices[i]
            for j in range(i+1,len(prices)):
                if prices[i]>=prices[j]:
                    res[i]=prices[i]-prices[j]
                    break
        return res