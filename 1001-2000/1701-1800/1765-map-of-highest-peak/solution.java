class Solution {
    private static final int[] dirs = {-1, 0, 1, 0, -1};
    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] ans = new int[m][n];
        Queue<int[]> q = new ArrayDeque<>();
        for (int[] row : ans)
            Arrays.fill(row, -1);
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (isWater[i][j] == 1) {
                    ans[i][j] = 0;
                    q.offer(new int[]{i, j});
                }

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int i = cur[0];
            int j = cur[1];
            for (int dir = 0; dir < 4; ++dir) {
                int x = i + dirs[dir];
                int y = j + dirs[dir + 1];
                if (x < 0 || y < 0 || x == m || y == n || ans[x][y] != -1)
                    continue;
                ans[x][y] = ans[i][j] + 1;
                q.offer(new int[]{x, y});
            }
        }
        return ans;
    }
}
