class Solution {
    char[][] board;
    char[] word;
    int n;
    int m;
    int wordLen;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        this.word = word.toCharArray();
        this.wordLen = this.word.length;
        this.n = board.length;
        this.m = board[0].length;
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                if (dfs(i, j, 0))
                    return true;
        return false;
    }

    private boolean dfs(int i, int j, int s) {
        if (i < 0 || i == n || j < 0 || j == m || board[i][j] != word[s] || board[i][j] == '*')
            return false;
        if (s == wordLen - 1)
            return true;

        char cache = board[i][j];
        board[i][j] = '*';
        if (dfs(i + 1, j, s + 1) ||
                dfs(i - 1, j, s + 1) ||
                dfs(i, j + 1, s + 1) ||
                dfs(i, j - 1, s + 1))
                return true;
        board[i][j] = cache;

        return false;
    }
}
