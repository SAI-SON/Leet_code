class Solution(object):
    def numSpecial(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        count=0
        for i in mat:
            if sum(i)==1:
                count+=1 if self.getcolumnsum(mat,i.index(1))==1 else 0
        return count
    def getcolumnsum(self,mat,index):
        sm=0
        for i in mat:
            sm+=i[index]
        return sm