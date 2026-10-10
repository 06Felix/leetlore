class Solution {
    private boolean RunBobRun(List<Integer>[] adj, int u, int[] ct, int time, int pt){
        if(u == 0){
            ct[0] = time;
            return true;
        }
        for(int v : adj[u]){
            if(pt != v && RunBobRun(adj, v, ct, time + 1, u)){
                ct[u] = time;
                return true;
            }
        }
        return false;
    }
    private int RunAliceRun(List<Integer>[] adj, int u, int[] ct, int time, int[] amt, int pt, int income){
        if(ct[u] > time)
            income += amt[u];
        else if(ct[u] == time)
            income += amt[u] / 2;

        if(u != 0 && adj[u].size() == 1)
            return income;

        int ans = Integer.MIN_VALUE;
        for(int v : adj[u])
            if(v != pt)
                ans = Math.max(ans, RunAliceRun(adj, v, ct, time + 1, amt, u, income));
        return ans;
    }
    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n = edges.length + 1;
        List<Integer>[] adj = new ArrayList[n];
        for(int i = 0 ; i < n ; i++)
            adj[i] = new ArrayList<>();
        for(int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        int[] ctBob = new int[n];
        Arrays.fill(ctBob, n + 1);
        RunBobRun(adj, bob, ctBob, 0, -1);
        return RunAliceRun(adj, 0, ctBob, 0, amount, -1, 0);
    }
}
