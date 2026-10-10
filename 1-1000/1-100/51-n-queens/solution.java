class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; ++i)
            Arrays.fill(board[i], '.');
        dfs(n, 0, 0, 0, 0, board, ans);
        return ans;
    }

    private void dfs(int n, int i, int cols, int diag1, int diag2, char[][] board, List<List<String>> ans) {
        if (i == n) {
            ans.add(construct(board, n));
            return;
        }
        for (int j = 0; j < n; ++j) {
            if ((cols & (1 << j)) > 0 || (diag1 & (1 << (i + j))) > 0 || (diag2 & (1 << (j - i + n - 1))) > 0)
                continue;
            board[i][j] = 'Q';
            cols |= (1 << j);
            diag1 |= (1 << (i + j));
            diag2 |= 1 << (j - i + n - 1);
            // cols[j] = diag1[i + j] = diag2[j - i + n - 1] = true;
            dfs(n, i + 1, cols, diag1, diag2, board, ans);
            cols ^= (1 << j);
            diag1 ^= (1 << (i + j));
            diag2 ^= 1 << (j - i + n - 1);
            // cols[j] = diag1[i + j] = diag2[j - i + n - 1] = false;
            board[i][j] = '.';
        }
    }

    private List<String> construct(char[][] board, int n) {
        List<String> listBoard = new ArrayList<>();
        for (int i = 0; i < n; i++)
            listBoard.add(String.valueOf(board[i]));
        return listBoard;
    }
}
