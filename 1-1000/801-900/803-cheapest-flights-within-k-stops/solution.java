class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            g.add(new ArrayList<>());
        }
        for (int[] edge : flights) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];
            g.get(u).add(new int[] {v, wt});
        }

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, src, 0});
        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int stops = node[0];
            int u = node[1];
            int distance = node[2];
            if (stops > k) {
                continue;
            }
            for (int[] edge : g.get(u)) {
                int v = edge[0];
                int wt = edge[1];
                if (distance + wt < dist[v] && stops <= k) {
                    dist[v] = distance + wt;
                    queue.offer(new int[] { stops + 1, v, distance + wt});
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
