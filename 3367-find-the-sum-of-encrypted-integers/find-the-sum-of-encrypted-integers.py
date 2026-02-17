class Solution(object):
    def sumOfEncryptedInt(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def findMax(n):
            mx=0
            while n != 0:
                rem=n%10
                mx=max(mx,rem)
                n//=10
            return mx
        for i in range(len(nums)):
            mx=findMax(nums[i])
            n=len(str(nums[i]))
            nums[i]=int(str(mx)*n)
        return sum(nums)