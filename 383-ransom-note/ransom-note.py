class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        dic={}
        for c in magazine:
            dic[c]=dic.get(c,0)+1

        for c in ransomNote:
            if c not in dic or dic[c]<=0:
                return False
            dic[c]-=1
        return True
        