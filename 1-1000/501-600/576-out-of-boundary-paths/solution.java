class Solution {
  public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
    final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    final int kMod = 1_000_000_007;
    int ans = 0;
    int[][] dp = new int[m][n];
    dp[startRow][startColumn] = 1;

    while (maxMove-- > 0) {
      int[][] newDp = new int[m][n];
      for (int i = 0; i < m; ++i)
        for (int j = 0; j < n; ++j)
          if (dp[i][j] > 0)
            for (int[] dir : dirs) {
              int x = i + dir[0];
              int y = j + dir[1];
              if (x < 0 || x == m || y < 0 || y == n)
                ans = (ans + dp[i][j]) % kMod;
              else
                newDp[x][y] = (newDp[x][y] + dp[i][j]) % kMod;
            }
      dp = newDp;
    }
    return ans;
  }
}
