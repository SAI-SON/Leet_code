class Solution(object):
    def checkDivisibility(self, n):
        """
        :type n: int
        :rtype: bool
        """
        add=0
        pro=1
        dup=n
        while dup!=0:
            temp=dup%10
            add+=temp
            pro*=temp
            dup/=10
        return n%(add+pro)==0
