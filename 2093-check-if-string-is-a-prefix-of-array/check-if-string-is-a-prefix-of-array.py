class Solution(object):
    def isPrefixString(self, s, words):
        """
        :type s: str
        :type words: List[str]
        :rtype: bool
        """
        strr=""
        for st in words:
            strr+=st
            if strr==s: return True
            if s.find(strr)==-1: return False
        return False