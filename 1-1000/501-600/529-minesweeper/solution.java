class Solution {
    private int numberOfMines(char[][] board, int i, int j, int n, int m) {
        int count = 0;
        int ll = Math.min(n - 1, i + 1), rl = Math.min(m - 1, j + 1);
        for(int l = Math.max(0, i - 1) ; l <= ll ; l++)
            for(int r = Math.max(0, j - 1) ; r <= rl ; r++)
                if((l != i || r != j) && (board[l][r] == 'M' || board[l][r] == 'X'))
                    count++;
        return count;
    }
    public void dfs(char[][] board, int i, int j, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || board[i][j] != 'E')
            return;
        int ct = numberOfMines(board, i, j, n, m);
        if(ct > 0){
            board[i][j] = (char)(ct + '0');
            return;
        }
        board[i][j] = 'B';
        dfs(board, i + 1, j, n, m);
        dfs(board, i, j + 1, n, m);
        dfs(board, i - 1, j, n, m);
        dfs(board, i, j - 1, n, m);
        dfs(board, i + 1, j + 1, n, m);
        dfs(board, i - 1, j + 1, n, m);
        dfs(board, i - 1, j - 1, n, m);
        dfs(board, i + 1, j - 1, n, m);
    }
    public char[][] updateBoard(char[][] board, int[] click) {
        int n = board.length;
        int m = board[0].length;
        int x = click[0], y = click[1];
        if(board[x][y] == 'M')
            board[x][y] = 'X';
        else
            dfs(board, x, y, n, m);
        return board;
    }
}
