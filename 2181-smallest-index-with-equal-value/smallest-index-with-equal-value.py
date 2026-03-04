class Solution(object):
    def smallestEqual(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        size=len(nums)
        for i in range(size):
            if i%10 == nums[i]:
                return i
        return -1