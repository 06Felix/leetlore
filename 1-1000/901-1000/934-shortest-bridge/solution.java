class Solution {
    private int[] dirs = {-1, 0, 1, 0, -1};
    private void dfs(int[][] mat, int i, int j, int n, Queue<int[]> q){
        if(i < 0 || j < 0 || i == n || j == n || (mat[i][j] & 1) == 0)
            return;
        mat[i][j] = 2;
        q.offer(new int[]{i, j});
        dfs(mat, i + 1, j, n, q);
        dfs(mat, i, j + 1, n, q);
        dfs(mat, i - 1, j, n, q);
        dfs(mat, i, j - 1, n, q);
    }
    public int shortestBridge(int[][] grid) {
        boolean found = false;
        int n = grid.length;
        Queue<int[]> q = new ArrayDeque<>();
        for(int i = 0 ; i < n && !found; i++)
            for(int j = 0 ; j < n ; j++){
                if(grid[i][j] == 1){
                    dfs(grid, i, j, n, q);
                    found = true;
                    break;
                }
            }
        int ans = 0;
        while(!q.isEmpty()){
            ans++;
            for(int sz = q.size() ; sz > 0 ; sz--){
                int[] cur = q.poll();
                int x = cur[0], y = cur[1];
                for(int d = 0 ; d < 4 ; d++){
                    int i = x + dirs[d];
                    int j = y + dirs[d + 1];
                    if(i < 0 || j < 0 || i == n || j == n || grid[i][j] == 2)
                        continue;
                    if(grid[i][j] == 1)
                        return ans - 1;
                    grid[i][j] = 2;
                    q.offer(new int[]{i, j});
                }
            }
        }
        return 1193;
    }
}
