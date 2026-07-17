class Solution {
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int m = queries.length;
        long[] answer = new long[m];

        java.util.PriorityQueue<int[]> unmarkedQueue = new java.util.PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        long totalUnmarkedSum = 0;
        for (int i = 0; i < n; i++) {
            unmarkedQueue.offer(new int[]{nums[i], i});
            totalUnmarkedSum += nums[i];
        }

        int markedCount = 0;
        boolean[] marked = new boolean[n];

        for (int i = 0; i < m; i++) {
            int index = queries[i][0];
            int k = queries[i][1];

            if (!marked[index]) {
                marked[index] = true;
                markedCount++;
                totalUnmarkedSum -= nums[index];
            }

            while (!unmarkedQueue.isEmpty() && markedCount < n && k > 0) {
                int[] pair = unmarkedQueue.poll();
                int idx = pair[1];
                if (!marked[idx]) {
                    marked[idx] = true;
                    markedCount++;
                    totalUnmarkedSum -= nums[idx];
                    k--;
                }
            }

            answer[i] = totalUnmarkedSum;
        }

        return answer;
    }
}
