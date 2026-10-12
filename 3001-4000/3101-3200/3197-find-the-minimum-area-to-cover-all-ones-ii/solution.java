class Solution {
    public int minimumSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int n = grid.length;
        int m = grid[0].length;

        // CASE 1 :
        // |````````|
        // |```|````|
        // |   |    |
        // ``````````
        for (int row = 1; row < n; row++)
            for (int col = 1; col < m; col++) {
                int top = minimumArea(0, row, 0, m, grid);
                int bLeft = minimumArea(row, n, 0, col, grid);
                int bRight = minimumArea(row, n, col, m, grid);
                ans = Math.min(ans, top + bLeft + bRight);
            }

        // CASE 2 :
        // |````|````|
        // |____|____|
        // |_________|
        for (int row = 1; row < n; row++)
            for (int col = 1; col < m; col++) {
                int tLeft = minimumArea(0, row, 0, col, grid);
                int tRight = minimumArea(0, row, col, m, grid);
                int bottom = minimumArea(row, n, 0, m, grid);
                ans = Math.min(ans, tLeft + tRight + bottom);
            }

        // CASE 3 :
        // |```````|
        // |```````|
        // |```````|
        // `````````
        for (int row1 = 1; row1 < n - 1; row1++)
            for (int row2 = row1 + 1; row2 < n; row2++) {
                int top = minimumArea(0, row1, 0, m, grid);
                int mid = minimumArea(row1, row2, 0, m, grid);
                int bottom = minimumArea(row2, n, 0, m, grid);
                ans = Math.min(ans, top + mid + bottom);
            }

        // CASE 4 :
        // |````|````|````|
        // |    |    |    |
        // |    |    |    |
        // ````````````````
        for (int col1 = 1; col1 < m - 1; col1++)
            for (int col2 = col1 + 1; col2 < m; col2++) {
                int left = minimumArea(0, n, 0, col1, grid);
                int mid = minimumArea(0, n, col1, col2, grid);
                int right = minimumArea(0, n, col2, m, grid);
                ans = Math.min(ans, left + mid + right);
            }

        // CASE 5 :
        // |````|````|
        // |    |____|
        // |    |    |
        // |____|____|

        for (int row = 1; row < n; row++)
            for (int col = 1; col < m; col++) {
                int left = minimumArea(0, n, 0, col, grid);
                int tRight = minimumArea(0, row, col, m, grid);
                int bRight = minimumArea(row, n, col, m, grid);
                ans = Math.min(ans, left + tRight + bRight);
            }

        // CASE 6 :
        // |````|````|
        // |____|    |
        // |    |    |
        // |____|____|
        for (int row = 1; row < n; row++)
            for (int col = 1; col < m; col++) {
                int tLeft = minimumArea(0, row, 0, col, grid);
                int bLeft = minimumArea(row, n, 0, col, grid);
                int right = minimumArea(0, n, col, m, grid);
                ans = Math.min(ans, tLeft + bLeft + right);
            }
        return ans;
    }

    public int minimumArea(int r1, int r2, int c1, int c2, int[][] grid) {
        int mnC = -1;
        int mxC = -1;
        int mnR = -1;
        int mxR = -1;

        colStart: for (int i = r1; i < r2; i++)
            for (int j = c1; j < c2; j++)
                if (grid[i][j] == 1) {
                    mnC = i;
                    break colStart;
                }

        colEnd: for (int i = r2 - 1; i >= r1; i--)
            for (int j = c1; j < c2; j++)
                if (grid[i][j] == 1) {
                    mxC = i;
                    break colEnd;
                }

        rowStart: for (int j = c1; j < c2; j++)
            for (int i = r1; i < r2; i++)
                if (grid[i][j] == 1) {
                    mnR = j;
                    break rowStart;
                }

        rowEnd: for (int j = c2 - 1; j >= c1; j--)
            for (int i = r1; i < r2; i++)
                if (grid[i][j] == 1) {
                    mxR = j;
                    break rowEnd;
                }

        return mxC == -1 ? 0 : (mxC - mnC + 1) * (mxR - mnR + 1);
    }
}
