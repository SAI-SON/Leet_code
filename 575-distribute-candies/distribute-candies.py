class Solution(object):
    def distributeCandies(self, candyType):
        """
        :type candyType: List[int]
        :rtype: int
        """
        length=len(set(candyType))
        return min(length,len(candyType)//2)
        