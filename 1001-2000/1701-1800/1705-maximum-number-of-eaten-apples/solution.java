class Solution {
    public int eatenApples(int[] apples, int[] days) {
        int n = apples.length;
        int ans = 0;
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < n || !minHeap.isEmpty(); ++i) {
            while (!minHeap.isEmpty() && minHeap.peek()[0] <= i)
                minHeap.poll();
            if (i < n && apples[i] > 0)
                minHeap.offer(new int[]{i + days[i], apples[i]});
            if (!minHeap.isEmpty()) {
                int rottenDay = minHeap.peek()[0];
                int numApples = minHeap.poll()[1];
                if (numApples > 1)
                    minHeap.offer(new int[]{rottenDay, numApples - 1});
                ++ans;
            }
        }
        return ans;
    }
}
