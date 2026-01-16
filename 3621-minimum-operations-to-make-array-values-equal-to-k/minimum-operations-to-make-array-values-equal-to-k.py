class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        mp={}
        for i in nums:
            if i<k: return -1
            elif i==k: continue
            else : mp[i]= mp.get(i,0)+1
        return len(mp)