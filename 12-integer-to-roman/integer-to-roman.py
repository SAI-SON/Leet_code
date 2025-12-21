class Solution(object):
    def intToRoman(self, num):
        """
        :type num: int
        :rtype: str
        """
        lst=[1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        strlst=["M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        st=""
        for i in range(len(lst)):
            if num==0: break
            while lst[i]<=num:
                st+=strlst[i]
                num-=lst[i]
        return st
        