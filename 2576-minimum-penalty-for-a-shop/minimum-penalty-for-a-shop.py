class Solution(object):
    def bestClosingTime(self, customers):
        """
        :type customers: str
        :rtype: int
        """
        c=mx=minp=0
        for i in range(len(customers)):
            if(customers[i]=='Y'):
                c+=1
            else:
                c-=1
            if mx<c:
                minp=i+1
                mx=c
        return minp