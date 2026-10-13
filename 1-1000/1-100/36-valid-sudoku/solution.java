class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][10];
        boolean[][] col = new boolean[9][10];
        boolean[][][] sub33 = new boolean[3][3][10];
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                if (board[i][j] == '.')
                    continue;
                int c = board[i][j] - '0';
                int sub_x = i / 3, sub_y = j / 3;
                if (row[i][c] || col[j][c] || sub33[sub_x][sub_y][c])
                    return false;
                row[i][c] = col[j][c] = sub33[sub_x][sub_y][c] = true;
            }
        return true;
    }
}
