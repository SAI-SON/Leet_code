class Solution(object):
    def minOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        c=0
        for i in range(1,len(nums)):
            if nums[i-1]>=nums[i]:
                adding=nums[i-1]-nums[i]+1
                nums[i]+=adding
                c+=adding
        return c
        