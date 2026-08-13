class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[n-1][n-1]==1) return -1;
        Queue<int[]>q=new LinkedList<>();
        q.add(new int[]{0,0,0});
        int shortest=Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int top[]=q.poll();
            if(top[0]==n-1 && top[1]==n-1){
                shortest=Math.min(top[2]+1,shortest);
                continue;
            }
            int i=top[0];
            int j=top[1];
            int w=top[2];
            if(i<0 || n<=i || j<0 || n<=j){
                continue;
            }
            if(grid[i][j]==1){
                continue;
            }
            grid[i][j]=1;
            //bottom
            q.add(new int[]{i+1,j,w+1});
            //right
            q.add(new int[]{i,j+1,w+1});
            //left
            q.add(new int[]{i,j-1,w+1});
            //top
            q.add(new int[]{i-1,j,w+1});
            //top-left
            q.add(new int[]{i-1,j-1,w+1});
            //top-right
            q.add(new int[]{i-1,j+1,w+1});
            //bottom-left
            q.add(new int[]{i+1,j-1,w+1});
            //bottom-right
            q.add(new int[]{i+1,j+1,w+1});
        }
        return shortest==Integer.MAX_VALUE?-1:shortest;
    }
}