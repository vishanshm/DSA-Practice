class Solution {
    char[][] board;
    List<List<String>> ans = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        board = new char[n][];
        for(int i = 0; i < n; i++){
            board[i] = new char[n];
            Arrays.fill(board[i],'.');
        }
        SNQ(n, 0);
        return ans;
    }
    private void SNQ(int n, int index){
        if (index == n){
            ans.add(construct());
            return;
        }
        for(int i = 0; i < n; i++){
            if(isSafe(index, i)){
                board[index][i] = 'Q';
                SNQ(n, index + 1);
                board[index][i] = '.';
            }
        }
    }
    private boolean check(int x, int y){
        for(int i = 0; i < x; i++){
            int j = 0;
            while(board[i][j] != 'Q') j++;
            if((j == y) || (x - i) == Math.abs(y - j))
                return false;
        }return true;
    }private boolean isSafe(int row, int col) {
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') return false;
        }
        for(int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if(board[i][j] == 'Q') return false;
        }
        for(int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if(board[i][j] == 'Q') return false;
        }
        return true;
    }
    private List<String> construct(){
        List<String> temp = new ArrayList<>();
        for(char[] row : board){
            temp.add(new String(row));
        }return temp;
    }
}