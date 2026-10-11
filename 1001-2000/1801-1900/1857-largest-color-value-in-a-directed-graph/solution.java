class Solution {
    public int largestPathValue(String colors, int[][] edges) {
        int n = colors.length();
        int ans = 0;
        int nodes = 0;
        List<Integer>[] adj = new List[n];
        int[] inD = new int[n];
        int[][] ct = new int[n][26];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            inD[v]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++)
            if (inD[i] == 0)
                q.offer(i);
        while (!q.isEmpty()) {
            nodes++;
            int cur = q.poll();
            ans = Math.max(ans, ++ct[cur][colors.charAt(cur) - 'a']);
            for (int x : adj[cur]) {
                for (int i = 0; i < 26; ++i)
                    ct[x][i] = Math.max(ct[x][i], ct[cur][i]);
                if (--inD[x] == 0)
                    q.offer(x);
            }
        }
        return nodes == n ? ans : -1;
    }
}
