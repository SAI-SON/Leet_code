class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> setrow=new HashSet<>();
        Set<Integer> setcol=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    setrow.add(i);
                    setcol.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(setrow.contains(i) || setcol.contains(j))
                matrix[i][j]=0;
            }
        }
    }
}