class Solution(object):
    def reverseOnlyLetters(self, s):
        """
        :type s: str
        :rtype: str
        """
        left=0
        right=len(s)-1
        arr=list(s)
        while(left<right):
            while(left<right and not arr[left].isalpha()): left+=1
            while(left<right and not arr[right].isalpha()): right-=1
            arr[left],arr[right]=arr[right],arr[left]
            left+=1
            right-=1
        return "".join(arr)