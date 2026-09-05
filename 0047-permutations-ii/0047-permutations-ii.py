class Solution(object):
    def permuteUnique(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        res=[]
        visit=[False]*len(nums)
        def bt(curr):
            if(len(curr)==len(nums)):
                res.append(curr[:])
                return
            for i in range(len(nums)):
                if(visit[i]):
                    continue
                if i>0 and nums[i]==nums[i-1] and not visit[i-1]:
                    continue
                visit[i]=True
                curr.append(nums[i])
                bt(curr)
                visit[i]=False
                curr.pop()
        bt([])
        return res