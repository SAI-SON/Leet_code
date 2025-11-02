class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int arr[][]=new int [n][n];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=k++;    
            }
        }
        int currI=0,currJ=0;
        for(String s:commands){
           if(s.equals("DOWN")){
            currI++;
           }
           else if(s.equals("RIGHT")){
            currJ++;
           }
           else if(s.equals("UP")){
            currI--;
           }
           else {
            currJ--;
           }
        }
        return arr[currI][currJ];
    }
}