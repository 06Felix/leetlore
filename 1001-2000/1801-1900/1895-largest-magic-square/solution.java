class Solution {
    private int[][] horPrf;
    private int[][] verPrf;
    private int[][] d1Prf;
    private int[][] d2Prf;
    private int m;
    private int n;

    public int largestMagicSquare(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        horPrf = new int[m + 2][n + 2];
        verPrf = new int[m + 2][n + 2];
        d1Prf = new int[m + 2][n + 2];
        d2Prf = new int[m + 2][n + 2];

        for (int i = 1; i <= m; ++i)
            for (int j = 1; j <= n; ++j) {
                verPrf[i][j] = grid[i - 1][j - 1] + verPrf[i - 1][j];
                horPrf[i][j] = grid[i - 1][j - 1] + horPrf[i][j - 1];
                d1Prf[i][j] = grid[i - 1][j - 1] + d1Prf[i - 1][j - 1];
                d2Prf[i][j] = grid[i - 1][j - 1] + d2Prf[i - 1][j + 1];
            }

        for (int size = Math.min(m, n); size > 1; size--)
            for (int i = 1; i + size <= m + 1; ++i)
                for (int j = 1; j + size <= n + 1; ++j)
                    if (isMagicSquare(i, j, size))
                        return size;

        return 1;
    }

    private boolean isMagicSquare(int x, int y, int size) {
        int required = horPrf[x][y + size - 1] - horPrf[x][y - 1];
        for (int i = x + 1; i < x + size; ++i)
            if (horPrf[i][y + size - 1] - horPrf[i][y - 1] != required)
                return false;

        for (int j = y; j < y + size; ++j)
            if (verPrf[x + size - 1][j] - verPrf[x - 1][j] != required)
                return false;

        int d1Sum = d1Prf[x + size - 1][y + size - 1] - d1Prf[x - 1][y - 1];
        int d2Sum = d2Prf[x + size - 1][y] - d2Prf[x - 1][y + size];
        return d1Sum == required && d2Sum == required;
    }
}
