class Solution {
    private int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int minCost(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<int[]> q = new ArrayDeque<>();
        dfs(grid, 0, 0, 0, q, vis);
        int cost = 0;
        while(!vis[n - 1][m - 1]){
            cost++;
            for (int sz = q.size(); sz > 0; sz--) {
                int[] cur = q.poll();
                int i = cur[0];
                int j = cur[1];
                for (int[] dir : dirs)
                    dfs(grid, i + dir[0], j + dir[1], cost, q, vis);
            }
        }
        return cost;
    }
    private void dfs(int[][] grid, int i, int j, int cost, Queue<int[]> q, boolean[][] vis) {
        if (i < 0 || i == grid.length || j < 0 || j == grid[0].length || vis[i][j])
            return;
        vis[i][j] = true;
        q.add(new int[]{i, j});
        int[] dir = dirs[grid[i][j] - 1];
        dfs(grid, i + dir[0], j + dir[1], cost, q, vis);
    }
}
