class Solution {
    public int minReorder(int n, int[][] cons) {
        List<Integer>[] g = new List[n];
        for (int i = 0; i < n; ++i)
            g[i] = new ArrayList<>();
        for (int[] con : cons) {
            int u = con[0];
            int v = con[1];
            g[u].add(v);
            g[v].add(-u);
        }
        return dfs(g, 0, -1);
    }

    private int dfs(List<Integer>[] g, int u, int parent) {
        int ans = 0;
        for (int v : g[u]) {
            if (Math.abs(v) == parent)
                continue;
            if (v > 0)
                ++ans;
            ans += dfs(g, Math.abs(v), u);
        }
        return ans;
    }
}
