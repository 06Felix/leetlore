class Solution {
    private void dfs(int[][] mat, int i, int j, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m || mat[i][j] == 1)
            return;
        mat[i][j] = 1;
        dfs(mat, i, j + 1, n, m);
        dfs(mat, i + 1, j, n, m);
        dfs(mat, i, j - 1, n, m);
        dfs(mat, i - 1, j, n, m);
    }
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                if(grid[i][j] == 0 && (i * j == 0 || i == n - 1 || j == m - 1))
                    dfs(grid, i, j, n, m);
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++)
                if(grid[i][j] == 0){
                    dfs(grid, i, j, n, m);
                    ans++;
                }
        return ans;
    }
}
