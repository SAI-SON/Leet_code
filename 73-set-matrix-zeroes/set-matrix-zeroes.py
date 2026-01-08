class Solution(object):
    def setZeroes(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: None Do not return anything, modify matrix in-place instead.
        """
        setrow=set()
        setcol=set()
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if matrix[i][j]==0:
                    setrow.add(i)
                    setcol.add(j)
        for i in range(len(matrix)):
            for j in range(len(matrix[i])):
                if i in setrow or j in setcol:
                    matrix[i][j]=0