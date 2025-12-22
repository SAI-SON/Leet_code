class Solution(object):
    def minCost(self, s, cost):
        """
        :type s: str
        :type cost: List[int]
        :rtype: int
        """
        total=0
        mx=0
        m=[0]*26
        for i in range(len(cost)):
            total+=cost[i]
            m[ord(s[i])-ord('a')]+=cost[i]
        for x in m:
            mx=max(mx,x)
        return total-mx