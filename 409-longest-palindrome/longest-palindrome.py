class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        singleDigit=0
        mp={}
        for i in s:
            mp[i]=mp.get(i,0)+1
            if(mp[i]%2==1):
                singleDigit+=1
            else:
                singleDigit-=1
        return len(s)-singleDigit+1 if singleDigit>1 else len(s)