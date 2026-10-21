class Solution {
    private List<int[]>[] adj;
    private int[] vis;
    private int[] values;
    private int ans = 0;
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        this.values = values;
        int n = values.length;
        adj = new List[n];
        vis = new int[n];
        for (int i = 0; i < n; ++i)
            adj[i] = new ArrayList<>();
        vis[0] = 1;
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int t = edge[2];
            adj[u].add(new int[]{v, t});
            adj[v].add(new int[]{u, t});
        }
        dfs(0, maxTime, values[0]);
        return ans;
    }
    private void dfs(int u, int remTime, int quality) {
        if (u == 0)
            ans = Math.max(ans, quality);
        for (int[] edge : adj[u]) {
            int v = edge[0];
            int t = edge[1];
            if (t > remTime)
                continue;
            ++vis[v];
            dfs(v, remTime - t, quality + (vis[v] == 1 ? values[v] : 0));
            --vis[v];
        }
    }
}
