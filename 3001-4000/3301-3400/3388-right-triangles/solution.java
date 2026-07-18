class Solution {
    public long numberOfRightTriangles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rC = new int[n];
        int[] cC = new int[m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1) {
                    rC[i]++;
                    cC[j]++;
                }
        long ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (grid[i][j] == 1)
                    ans += (rC[i] - 1) * (cC[j] - 1);
        return ans;
    }
}
