class Solution(object):
    def makeGood(self, s):
        """
        :type s: str
        :rtype: str
        """
        stack=[]
        for x in s:
            if stack and abs(ord(stack[-1])-ord(x))==32:
                stack.pop()
            else:
                stack.append(x)
        return "".join(stack)
        