class Solution {
  public int matrixScore(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;
    int ans = m;
    for (int j = 1; j < n; ++j) {
      int ct = 0;
      for (int i = 0; i < m; ++i)
        ct += grid[i][j] == grid[i][0] ? 1 : 0;
      ans = ans * 2 + Math.max(ct, m - ct);
    }

    return ans;
  }
}
