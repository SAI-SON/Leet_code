class Solution(object):
    def numberOfLines(self, widths, s):
        """
        :type widths: List[int]
        :type s: str
        :rtype: List[int]
        """
        r=1
        c=0
        for i in s:
            width=widths[ord(i)-ord('a')]
            r+=1 if width+c >100 else 0
            c=width if width+c >100 else c+width
        return [r,c]