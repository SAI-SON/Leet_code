class Solution(object):
    def balancedStringSplit(self, s):
        """
        :type s: str
        :rtype: int
        """
        c=0
        l=0
        r=0
        for x in s:
            if x=='L': l+=1
            if x=='R': r+=1
            if l==r: c+=1
        return c

        