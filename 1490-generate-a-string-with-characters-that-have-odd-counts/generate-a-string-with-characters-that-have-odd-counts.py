class Solution(object):
    def generateTheString(self, n):
        """
        :type n: int
        :rtype: str
        """
        return "a"*(n-1)+"b" if n&1!=1 else "a"*n
        