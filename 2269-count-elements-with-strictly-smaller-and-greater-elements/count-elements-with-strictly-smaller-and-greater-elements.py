class Solution(object):
    def countElements(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=0
        mn=min(nums)
        mx=max(nums)
        for i in nums:
            if mn<i and mx>i:
                count+=1
            else:
                continue
        return count