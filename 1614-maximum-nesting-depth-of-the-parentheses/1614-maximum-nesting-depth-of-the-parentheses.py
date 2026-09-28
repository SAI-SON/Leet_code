class Solution(object):
    def maxDepth(self, s):
        """
        :type s: str
        :rtype: int
        """
        par=0
        ma=0
        for i in s:
            if i=='(':
                par+=1
            elif i==')':
                par-=1
            ma=max(par,ma)
        return ma