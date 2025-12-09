class Solution(object):
    def kthFactor(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        lst=[]
        for i in range(1,n+1):
            if n%i==0:
                lst.append(i)
        return lst[k-1] if len(lst)>=k else -1
        