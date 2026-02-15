class Solution(object):
    def addBinary(self, a, b):
        """
        :type a: str
        :type b: str
        :rtype: str
        """
        br1=int(a,2)
        br2=int(b,2)
        res=br1+br2
        return bin(res)[2:]