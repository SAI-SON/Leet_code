class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        res=letters[0]
        flag=False
        for i in letters:
            if not flag:
                if(i > target):
                    res=i
                    flag=not flag
            else:
                if target < i and i < res:
                    res=i
        return res 
            