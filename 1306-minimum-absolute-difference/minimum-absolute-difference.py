class Solution(object):
    def minimumAbsDifference(self, arr):
        """
        :type arr: List[int]
        :rtype: List[List[int]]
        """
        arr.sort()
        res=[]
        minval=float('inf')
        for i in range(1,len(arr)):
            minval=min(minval,arr[i]-arr[i-1])
        for i in range(1,len(arr)):
            if abs(arr[i]-arr[i-1])==minval:
                res.append([arr[i-1],arr[i]])
        return res