class Solution(object):
    def bitwiseComplement(self, n):
        """
        :type n: int
        :rtype: int
        """
        # print(bin(n))
        a=bin(n)
        b=""
        # print(a)
        for i in range(2,len(a)):
            if a[i]=="1":
                b+="0"
            else:
                b+="1"
        # print(b)
        res=int(b,2)
        
        return res