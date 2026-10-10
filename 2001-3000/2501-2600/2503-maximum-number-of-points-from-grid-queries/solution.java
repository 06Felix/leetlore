class Solution {
    public int[] maxPoints(int[][] grid, int[] queries) {
        record T(int i, int j, int val) {}
        int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[queries.length];
        Queue<T> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        boolean[][] seen = new boolean[m][n];
        minHeap.offer(new T(0, 0, grid[0][0]));
        seen[0][0] = true;
        int accumulate = 0;
        for (IQ IQ : getIndexedQueries(queries)) {
            int qId = IQ.qId;
            int q = IQ.q;
            while (!minHeap.isEmpty()) {
                int i = minHeap.peek().i;
                int j = minHeap.peek().j;
                int val = minHeap.poll().val;
                if (val >= q) {
                    minHeap.offer(new T(i, j, val));
                    break;
                }
                ++accumulate;
                for (int[] dir : dirs) {
                    int x = i + dir[0];
                    int y = j + dir[1];
                    if (x < 0 || x == m || y < 0 || y == n)
                        continue;
                    if (seen[x][y])
                        continue;
                    minHeap.offer(new T(x, y, grid[x][y]));
                    seen[x][y] = true;
                }
            }
            ans[qId] = accumulate;
        }

        return ans;
    }

    private record IQ(int qId, int q) {}
    private IQ[] getIndexedQueries(int[] queries) {
        IQ[] iqs = new IQ[queries.length];
        for (int i = 0; i < queries.length; ++i)
        iqs[i] = new IQ(i, queries[i]);
        Arrays.sort(iqs, (a, b) -> a.q - b.q);
        return iqs;
    }
}
