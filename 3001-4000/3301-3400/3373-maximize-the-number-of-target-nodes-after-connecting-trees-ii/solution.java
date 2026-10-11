class Solution {
  public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;
        List<Integer>[] adj1 = make(edges1, n);
        List<Integer>[] adj2 = make(edges2, m);
        boolean[] pair1 = new boolean[n];
        boolean[] pair2 = new boolean[m];
        int even1 = dfs(adj1, 0, -1, pair1, true);
        int even2 = dfs(adj2, 0, -1, pair2, true);
        int odd1 = n - even1;
        int odd2 = m - even2;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int tree1 = pair1[i] ? even1 : odd1;
            int tree2 = Math.max(even2, odd2);
            ans[i] = tree1 + tree2;
        }
        return ans;
    }
    private int dfs(List<Integer>[] adj, int u, int prev, boolean[] pair, boolean even) {
        int ans = even ? 1 : 0;
        pair[u] = even;
        for (int v : adj[u])
            if (v != prev)
                ans += dfs(adj, v, u, pair, !even);
        return ans;
    }
    private List<Integer>[] make(int[][] edges, int n) {
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        return adj;
    }
}
