class Solution {
    public int countPathsWithXorValue(int[][] grid, int k) {
        int mod = 1000000007;
        int n = grid.length;
        int m = grid[0].length;
        int[][][] dp = new int[n][m][16];
        dp[0][0][grid[0][0]] = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                for (int x = 0; x <= 15; x++) {
                    if (i + 1 < n) {
                        int cur = x ^ grid[i + 1][j];
                        dp[i + 1][j][cur] += dp[i][j][x];
                        dp[i + 1][j][cur] %= mod;
                    }
                    if (j + 1 < m) {
                        int cur = x ^ grid[i][j + 1];
                        dp[i][j + 1][cur] += dp[i][j][x];
                        dp[i][j + 1][cur] %= mod;
                    }
            }
        return dp[n - 1][m - 1][k];
    }
}
