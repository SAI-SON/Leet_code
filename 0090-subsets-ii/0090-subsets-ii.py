class Solution(object):
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res=[]
        def bt(index,curr):
            res.append(curr[:])
            for i in range(index,len(nums)):
                if i>index and nums[i]==nums[i-1]:
                    continue
                curr.append(nums[i])
                bt(i+1,curr)
                curr.pop()
        bt(0,[])
        return res