class Solution(object):
    def replaceDigits(self, s):
        """
        :type s: str
        :rtype: str
        """
        lastLetter=0
        st=""
        for x in s:
            if x.isalpha():
                st+=x
                lastLetter=x
            else:
                st+=chr(ord(lastLetter)+int(x))

        return st
        