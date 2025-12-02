class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr=[0]*26
        for x in s:
            arr[ord(x)-ord('a')]+=1
        for x in range(len(s)):
            if arr[ord(s[x])-ord('a')]==1:
                return x

        return -1

        