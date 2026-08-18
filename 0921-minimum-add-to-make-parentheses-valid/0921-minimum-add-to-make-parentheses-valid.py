class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        count=0
        add=0
        for i in s:
            if i=='(':
                count+=1
            else:
                if count>0:
                    count-=1
                else: 
                    add+=1
        return count+add