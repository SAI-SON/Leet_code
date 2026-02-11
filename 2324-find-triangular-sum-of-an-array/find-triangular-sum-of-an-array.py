class Solution(object):
    def triangularSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        k=0
        while(k<len(nums)):
            for i in range(1,len(nums)-k):
                nums[i-1]=(nums[i]+nums[i-1])%10
            k+=1
        return nums[0]        