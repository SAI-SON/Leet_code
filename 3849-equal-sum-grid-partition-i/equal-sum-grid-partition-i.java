class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long sum=0;
        for(int g[]:grid){
            for(int num:g){
                sum+=num;
            }
        }
        int n=grid.length;
        int m=grid[0].length;
        long cpy_sum=sum;
        long ver=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ver+=grid[i][j];
                cpy_sum-=grid[i][j];
            }
            if(ver==cpy_sum){
                return true;
            }
        }
        long hor=0;
        cpy_sum=sum=sum;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                hor+=grid[j][i];
                cpy_sum-=grid[j][i];
            }
            if(hor==cpy_sum){
                return true;
            }
        }
        return false;
    }
}