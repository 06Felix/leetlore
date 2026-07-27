class Solution {
  public int[][] colorBorder(int[][] grid, int r0, int c0, int color) {
    int n = grid.length;
    int m = grid[0].length;
    dfs(grid, r0, c0, grid[r0][c0], new boolean[n][m]);

    for (int i = 0; i < grid.length; ++i)
      for (int j = 0; j < grid[0].length; ++j)
        if (grid[i][j] < 0)
          grid[i][j] = color;

    return grid;
  }

  private void dfs(int[][] grid, int i, int j, int sC, boolean[][] vis) {
    if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || vis[i][j] || grid[i][j] != sC)
      return;
    vis[i][j] = true;
    grid[i][j] = -sC;
    dfs(grid, i + 1, j, sC, vis);
    dfs(grid, i - 1, j, sC, vis);
    dfs(grid, i, j + 1, sC, vis);
    dfs(grid, i, j - 1, sC, vis);
    if (i == 0 || i == grid.length - 1 || j == 0 || j == grid[0].length - 1)
      return;
    if (Math.abs(grid[i + 1][j]) == sC && Math.abs(grid[i - 1][j]) == sC && Math.abs(grid[i][j + 1]) == sC && Math.abs(grid[i][j - 1]) == sC)
      grid[i][j] = sC;
  }
}
