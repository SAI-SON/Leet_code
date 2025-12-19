class Solution(object):
    def selfDividingNumbers(self, left, right):
        """
        :type left: int
        :type right: int
        :rtype: List[int]
        """
        def isdivide(num):
            org=num
            while num!=0:
                rem=num%10
                if rem==0 or org % rem != 0:
                    return False
                num//=10
            return True
                                                                                                                          
        lst=[]
        for i in range(left,right+1):
            if i<=9:
                lst.append(i)
                continue
            if isdivide(i):
                lst.append(i)
        
        return lst


        
        