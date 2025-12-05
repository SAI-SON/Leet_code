class Solution(object):
    def countPartitions(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        s=sum(nums)
        pre=c=0
        for i in range(len(nums)-1):
            pre+=nums[i]
            s-=nums[i]
            if ((pre-s)&1)==0:
                c+=1

        return c