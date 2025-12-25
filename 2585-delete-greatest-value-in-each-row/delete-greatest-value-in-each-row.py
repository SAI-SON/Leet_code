class Solution(object):
    def deleteGreatestValue(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        for row in grid:
            row.sort()
        sm=0
        for i in range(len(grid[0])):
            mx=grid[0][i]
            for j in range(len(grid)):
                mx=max(mx,grid[j][i])
            sm+=mx
        return sm