class Solution(object):
    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        visit=[False]*len(nums)
        def bt(curr):
            if len(curr)==len(nums):
                res.append(curr[:])
                return 
            for i in range(len(nums)):
                if visit[i]:
                    continue
                visit[i]=True
                curr.append(nums[i])
                bt(curr)
                curr.pop()
                visit[i]=False
        bt([])
        return res  