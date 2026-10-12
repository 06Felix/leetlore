class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int rows = n;
        int cols = m;

        colStart: for (int i = 0; i < n; i++, rows--)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1)
                    break colStart;

        colEnd: for (int i = n - 1; i >= 0; i--, rows--)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1)
                    break colEnd;

        rowStart: for (int j = 0; j < m; j++, cols--)
            for (int i = 0; i < n; i++)
                if (grid[i][j] == 1)
                    break rowStart;

        rowEnd: for (int j = m - 1; j >= 0; j--, cols--)
            for (int i = 0; i < n; i++)
                if (grid[i][j] == 1)
                    break rowEnd;

        return rows * cols;
    }
}
