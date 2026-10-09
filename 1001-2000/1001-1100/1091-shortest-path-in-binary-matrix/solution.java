class Solution {
    public int[] dirs = {-1, -1, 1, 1, -1, 0, 1, 0, -1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;
        if(n == 1)
            return 1;
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][] vis = new boolean[n][n];
        vis[0][0] = true;
        q.offer(new int[]{0, 0});
        int ans = 1;
        while(!q.isEmpty()){
            ans++;
            for(int sz = q.size() ; sz > 0 ; sz--){
                int[] cur = q.poll();
                int x = cur[0];
                int y = cur[1];
                for(int d = 0 ; d < 8 ; d++){
                    int i = x + dirs[d];
                    int j = y + dirs[d + 1];
                    if(i == n - 1 && j == n - 1)
                        return ans;
                    if(i < 0 || j < 0 || i == n || j == n || vis[i][j] || grid[i][j] == 1)
                        continue;
                    vis[i][j] = true;
                    q.offer(new int[]{i, j});
                }
            }
        }
        return -1;
    }
}
