class Solution {
    private static final int dirs[][] = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
    
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int ans = Integer.MAX_VALUE;
        int l = 0, h = n * n - 1;
        boolean vis[][];
        while (l <= h) {
            vis = new boolean[n][n];
            int m = (l + h) / 2;
            if (grid[0][0] <= m && dfs(0, 0, m, grid, vis, n)) {
                ans = m;
                h = m - 1;
            }
            else
                l = m + 1;
        }
        return ans;
    }

    boolean dfs(int x, int y, int t, int[][] grid, boolean[][] vis, int n) {
        vis[x][y] = true;
        if (x == n - 1 && y == n - 1)
            return true;

        for (int[] dir : dirs) {
            int nx = x + dir[0];
            int ny = y + dir[1];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n || vis[nx][ny] || grid[nx][ny] > t)
                continue;
            if (dfs(nx, ny, t, grid, vis, n))
                    return true;
        }
        return false;
    }
}
