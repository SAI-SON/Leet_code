class Solution {
    public int countBattleships(char[][] board) {
          int row = board.length;
        int col = board[0].length;
        int count = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'X') {
                    if ((i == 0 || board[i-1][j] == '.') && (j == 0 || board[i][j-1] == '.')) {
                        count++;
                        System.out.println(i+"=i  "+j+"=j  "+count+" "+board[i][j]);
                    }

                }
            }
        }
        return count;
    }
}