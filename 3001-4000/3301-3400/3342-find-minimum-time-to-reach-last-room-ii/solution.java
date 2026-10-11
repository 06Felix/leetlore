class Solution {
    public int minTimeToReach(int[][] moveTime) {
        int n = moveTime.length;
        int m = moveTime[0].length;
        moveTime[0][0] = -1;

        Queue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.offer(new int[] {0, 0, 0, 1});

        int[][] minTime = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                minTime[i][j] = Integer.MAX_VALUE;
        minTime[0][0] = 0;

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int i = current[0], j = current[1], curTime = current[2], curStep = current[3];

            if (i == n - 1 && j == m - 1) {
                return curTime;
            }

            for (int[] dir : directions) {
                int ni = i + dir[0], nj = j + dir[1];
                if (ni >= 0 && ni < n && nj >= 0 && nj < m) {
                    int newTime = Math.max(curTime + curStep, moveTime[ni][nj] + curStep);
                    if (newTime < minTime[ni][nj]) {
                        minTime[ni][nj] = newTime;
                        pq.offer(new int[] {ni, nj, newTime, curStep ^ 3});
                    }
                }
            }
        }

        return -1;
    }
}
