class Solution {
    List<List<String>> list=new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char arr[][]=new char[n][n];
        for(char i[]:arr){
            Arrays.fill(i,'.');
        }
        bt(arr,n,0);
        return list;
    }
    void bt(char c[][],int n,int row){
        if(row==n){
            List<String> l=new ArrayList<>();
            for(char ch[]:c){
                l.add(new String(ch));
            }
            list.add(l);
            return;
        }

        for(int i=0;i<n;i++){
            if(isSafe(c,row,i)){
                c[row][i]='Q';
                bt(c,n,row+1);
                c[row][i]='.';
            }
        }
    }
    boolean isSafe(char[][] ch, int row,int col){
        int r=row,c=col;
        while(r>=0 && c>=0){
            if(ch[r][c]=='Q'){
                return false;
            }
            r--;
        }
        r=row;
        c=col;
        while(0<=c && 0<=r){
            if(ch[r][c]=='Q') return false;
            c--;
            r--;
        }  
        r=row;
        c=col;
        while(0<=r && c<ch.length){
            if(ch[r][c]=='Q') return false;
            c++;
            r--;
        } 
        return true;
    }
}