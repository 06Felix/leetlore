class Solution {
    private int dfs(List<Integer>[] adj, int u, int pt, int k) {
        if (k == 0)
            return 1;
        int ans = 0;
        for (final int v : adj[u])
            if (v != pt)
                ans += dfs(adj, v, u, k - 1);
        return ans + 1;
    }
    private List<Integer>[] make(int[][] edges, int n) {
        List<Integer>[] adj = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++)
            adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        return adj;
    }
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n1 = edges1.length;
        int n2 = edges2.length;
        int[] ans = new int[n1 + 1];
        List<Integer>[] adj1 = make(edges1, n1);
        List<Integer>[] adj2 = make(edges2, n2);
        int mx2 = 0;
        if (k > 0)
            for (int i = 0; i < n2 + 1; ++i)
                mx2 = Math.max(mx2, dfs(adj2, i, -1, k - 1));
        for (int i = 0; i < n1 + 1; ++i)
            ans[i] = mx2 + dfs(adj1, i, -1, k);
        return ans;
    }
}
