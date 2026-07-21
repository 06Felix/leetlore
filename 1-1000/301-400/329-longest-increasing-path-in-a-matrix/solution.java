class Solution {
  public int longestIncreasingPath(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int ans = 0;
    int[][] mem = new int[m][n];

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        ans = Math.max(ans, dfs(matrix, i, j, Integer.MIN_VALUE, mem));

    return ans;
  }

  private int dfs(int[][] matrix, int i, int j, int prev, int[][] mem) {
    if (i < 0 || i == matrix.length || j < 0 || j == matrix[0].length || matrix[i][j] <= prev)
      return 0;
    if (mem[i][j] > 0)
      return mem[i][j];

    int curr = matrix[i][j];
    int a = dfs(matrix, i + 1, j, curr, mem);
    int b = dfs(matrix, i - 1, j, curr, mem);
    int c = dfs(matrix, i, j + 1, curr, mem);
    int d = dfs(matrix, i, j - 1, curr, mem);
    return mem[i][j] = 1 + Math.max(Math.max(a, b), Math.max(c, d));
  }
}
