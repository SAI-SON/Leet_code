class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        def bt(index , curr):
            res.append(curr[:])
            for i in range(index,len(nums)):
                curr.append(nums[i])
                bt(i+1,curr)
                curr.pop()
        bt(0,[])
        return res        