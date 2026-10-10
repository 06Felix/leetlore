class Solution {
    public int countPaths(int n, int[][] roads) {
        List<int[]>[] adj = new List[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            int w = road[2];
            adj[u].add(new int[]{v, w});
            adj[v].add(new int[]{u, w});
        }
        return find(adj, 0, n - 1);
    }
    private int MOD = 1_000_000_007;
    private int find(List<int[]>[] adj, int src, int dst) {
        int n = dst + 1;
        long[] ways = new long[n];
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        ways[src] = 1;
        dist[src] = 0;
        Queue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        pq.offer(new long[]{dist[src], src});
        while (!pq.isEmpty()) {
            long[] cur = pq.poll();
            long d = cur[0];
            int u = (int) cur[1];
            if (d > dist[u])
                continue;
            for (int[] pair : adj[u]) {
                int v = pair[0];
                int w = pair[1];
                if (d + w < dist[v]) {
                    dist[v] = d + w;
                    ways[v] = ways[u];
                    pq.offer(new long[]{dist[v], v});
                }
                else if (d + w == dist[v]) {
                    ways[v] += ways[u];
                    ways[v] %= MOD;
                }
            }
        }
        return (int) ways[dst];
    }
}
