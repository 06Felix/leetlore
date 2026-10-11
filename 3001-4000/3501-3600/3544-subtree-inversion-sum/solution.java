class Solution {
    public long subtreeInversionSum(int[][] edges, int[] nums, int k) {
        int n = nums.length;
        List<Integer>[] adj = new ArrayList[n];
        List<Integer>[] child = new ArrayList[n];
        int[] pt = new int[n];
        Arrays.fill(pt, -1);
        pt[0] = 0;
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            child[i] = new ArrayList<>();
        }
        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u])
                if (pt[v] < 0) {
                    pt[v] = u;
                    q.offer(v);
                    child[u].add(v);
                }
        }
        long[][][] dp = new long[n][k + 1][2];
        Deque<int[]> st = new ArrayDeque<>();
        st.add(new int[]{0, 0});
        while (!st.isEmpty()) {
            int[] cur = st.pollLast();
            int u = cur[0];
            int stg = cur[1];
            if (stg == 0) {
                st.add(new int[]{u, 1});
                for(int v : child[u])
                    st.add(new int[]{v, 0});
            }
            else {
                long[][] acc = new long[k + 1][2];
                for (int v : child[u])
                    for (int i = 1; i <= k; i++) {
                        acc[i][0] += dp[v][i][0];
                        acc[i][1] += dp[v][i][1];
                    }
                for (int i = 0; i <= k; i++) {
                    for (int j = 0; j < 2; j++) {
                        int nd = i < k ? i + 1 : k;
                        long best = (j == 0 ? nums[u] : -nums[u]) + acc[nd][j];
                        if (i >= k) {
                            long alt = ((j ^ 1) == 0 ? nums[u] : -nums[u]) + acc[1][j ^ 1];
                            if (alt > best) best = alt;
                        }
                        dp[u][i][j] = best;
                    }
                }
            }
        }
        return dp[0][k][0];
    }
}
