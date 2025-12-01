class Solution(object):
    def countElements(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        # return len(set(nums))-k if k>1 else len(nums)
        if k<1:
            return len(nums)
        nums.sort()
        c=0
        value=nums[len(nums)-k]
        for x in nums:
            if(value>x):
                 c+=1

        return c
        