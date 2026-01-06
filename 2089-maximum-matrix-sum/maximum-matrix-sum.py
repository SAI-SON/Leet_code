class Solution(object):
    def maxMatrixSum(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: int
        """
        minn=float('inf')
        total=0
        count=0
        for i in matrix:
            for j in i:
                total+=abs(j)
                if(j<0): count+=1
                minn=min(minn,abs(j))
        return total if(count%2==0) else total-2*minn