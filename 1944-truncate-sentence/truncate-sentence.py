class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        res=""
        st=s.split(" ")
        for i in range(0,k):
            if i==k-1:
                res+=st[i]
            else :
                res+=st[i]+" "
        return res

        