class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> q = new ArrayDeque<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (mat[i][j] == 0)
                    q.offer(new int[] {i, j});
                else
                    mat[i][j] = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            int i = q.peek()[0];
            int j = q.poll()[1];
            for (int[] dir : dirs) {
                int x = i + dir[0];
                int y = j + dir[1];
                if (x < 0 || x == m || y < 0 || y == n || mat[x][y] <= mat[i][j] + 1)
                    continue;
                q.offer(new int[] {x, y});
                mat[x][y] = mat[i][j] + 1;
            }
        }
        return mat;
    }
}
