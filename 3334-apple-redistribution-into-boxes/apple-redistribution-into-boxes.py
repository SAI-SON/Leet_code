class Solution(object):
    def minimumBoxes(self, apple, capacity):
        """
        :type apple: List[int]
        :type capacity: List[int]
        :rtype: int
        """
        sm=sum(apple)
        capacity.sort(reverse=True)
        c=0
        for i in capacity:
            sm-=i
            c+=1
            if sm<=0: break
        return c