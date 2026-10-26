class Solution {
    private static final int[][] DIR = {
        {1, 0}, {-1, 0}, {0, 1}, {0, -1}
    };

    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] seen = new boolean[m][n];
        int ans = 0;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (grid[i][j] <= 0 || seen[i][j])
                    continue;

                long sum = 0;
                ArrayDeque<Integer> que = new ArrayDeque<>();
                que.offer(i * n + j);
                seen[i][j] = true;

                while (!que.isEmpty()) {
                    int node = que.poll();
                    int row = node / n;
                    int col = node % n;
                    sum += grid[row][col];

                    for (int[] dir : DIR) {
                        int nextRow = row + dir[0];
                        int nextCol = col + dir[1];

                        if (nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n)
                            continue;

                        if (grid[nextRow][nextCol] <= 0 || seen[nextRow][nextCol])
                            continue;

                        seen[nextRow][nextCol] = true;
                        que.offer(nextRow * n + nextCol);
                    }
                }

                if (sum % k == 0)
                    ++ans;
            }
        }

        return ans;
    }
}
