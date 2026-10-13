class H{
    public int i, j, h;
    H(int a, int b, int c){
        i = a;
        j = b;
        h = c;
    }
}
class Solution {
    public int trapRainWater(int[][] grid) {
        Queue<H> q = new PriorityQueue<>((H1, H2) -> H1.h - H2.h);
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] seen = new boolean[n][m];
        for(int i = 0 ; i < n ; i++){
            q.add(new H(i, 0, grid[i][0]));
            q.add(new H(i, m - 1, grid[i][m - 1]));
            seen[i][0] = true;
            seen[i][m - 1] = true;
        }
        for(int i = 1 ; i < m - 1 ; i++){
            q.add(new H(0, i, grid[0][i]));
            q.add(new H(n - 1, i, grid[n - 1][i]));
            seen[0][i] = true;
            seen[n - 1][i] = true;
        }
        int ans = 0;
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(!q.isEmpty()){
            H cur = q.poll();
            int i = cur.i;
            int j = cur.j;
            int h = cur.h;
            for(int[] dir : dirs){
                int x = i + dir[0];
                int y = j + dir[1];
                if(x < 0 || y < 0 || x >= n || y >= m || seen[x][y])
                    continue;
                if(grid[x][y] < h){
                    ans += h - grid[x][y];
                    q.offer(new H(x, y, h));
                }
                else
                    q.offer(new H(x, y, grid[x][y]));
                seen[x][y] = true;
            }
        }
        return ans;
    }
}
