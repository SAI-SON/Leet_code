class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        arr=[0]*(len(nums)+1)
        for x in nums:
            arr[x]+=1
        res=[]
        for i in range(1,len(nums)+1):
            if arr[i]==0:
                res.append(i)
        return res