class Solution(object):
    def diStringMatch(self, s):
        """
        :type s: str
        :rtype: List[int]
        """
        n=len(s)
        arr=[0]*(n+1)
        left=0
        right=n
        ind=0
        for i in s:
            if i=='I':
                arr[ind]=left
                left+=1
            else:
                arr[ind]=right
                right-=1
            ind+=1
        if left<=right: arr[ind]=left
        return arr