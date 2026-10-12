class Solution {
    public int maxEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int last = 0;
        for (int[] e : events)
            last = Math.max(last, e[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ans = 0;
        for (int i = 0, d = 1; d <= last; d++) {
            while (!pq.isEmpty() && pq.peek() < d)
                pq.poll();
            while (i < n && events[i][0] <= d) {
                pq.add(events[i][1]);
                i++;
            }
            if (!pq.isEmpty()) {
                pq.poll();
                ans++;
            }
        }
        return ans;                                                                    
    }
}
