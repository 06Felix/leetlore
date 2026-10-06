class Solution {
    private int ans = 0;
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        for(int i = 0 ; i < n ; i++)
            dfs(grid, vis, i, 0, n, m, -1, -1);
        return ans;
    }
    private void dfs(int[][] grid, boolean[][] vis, int i, int j, int n, int m, int ct, int prv){
        if(i < 0 || j < 0 || i == n || j == m || grid[i][j] <= prv){
            ans = Math.max(ans, ct);
            return;
        }
        if(vis[i][j])
            return;
        vis[i][j] = true;
        dfs(grid, vis, i - 1, j + 1, n, m, ct + 1, grid[i][j]);
        dfs(grid, vis, i, j + 1, n, m, ct + 1, grid[i][j]);
        dfs(grid, vis, i + 1, j + 1, n, m, ct + 1, grid[i][j]);
    }
}
