class Solution(object):
    def maxAbsoluteSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mx=mn=maxsum=minsum=0
        for x in nums:
            maxsum+=x
            minsum+=x
            mx=max(mx,maxsum)
            mn=min(mn,minsum)
            if minsum>0: minsum=0
            if maxsum<0: maxsum=0
        return max(mx,abs(mn)) 
        