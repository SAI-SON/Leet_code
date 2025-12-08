class Solution(object):
    def countTriples(self, n):
        """
        :type n: int
        :rtype: int
        """
        count=0
        for i in range(1,n+1):
            for j in range(1,n+1):
                cs=i*i+j*j
                c=int(cs**0.5)
                if(c*c==cs and c<=n):
                    count+=1

        return count
        