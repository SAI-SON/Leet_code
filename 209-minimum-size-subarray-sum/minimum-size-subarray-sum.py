class Solution(object):
    def minSubArrayLen(self, target, nums):
        """
        :type target: int
        :type nums: List[int]
        :rtype: int
        """
        min_len=float('inf')
        sum=0
        k=0
        for i in range(len(nums)):
            sum+=nums[i]
            while sum>=target:
                min_len=min(min_len,i-k+1)
                sum-=nums[k]
                k+=1
            
        return 0 if(min_len==float('inf')) else min_len
