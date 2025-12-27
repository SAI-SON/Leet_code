class Solution(object):
    def maximumHappinessSum(self, happiness, k):
        """
        :type happiness: List[int]
        :type k: int
        :rtype: int
        """
        sm=val=0
        happiness.sort()
        for i in range(k):
            last=happiness[len(happiness)-i-1]
            last-=val
            if last<=0: break
            sm+=last
            val+=1
        return sm