class Solution {
    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        int m = edges.length;

        List<Integer>[] adj = new ArrayList[n];
        Set<Integer>[] child = new HashSet[n];
        int[] xor = nums.clone();
        int[] inDeg = new int[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            child[i] = new HashSet<>();
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            adj[u].add(v);
            adj[v].add(u);
            inDeg[u]++;
            inDeg[v]++;
        }
        int total = 0;
        for (int val : nums)
            total ^= val;
        boolean[] vis = new boolean[n];
        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++)
            if (inDeg[i] == 1) {
                q.add(i);
                vis[i] = true;
            }

        while (!q.isEmpty()) {
            int u = q.poll();
            for (int v : adj[u]) {
                if (!vis[v]) {
                    child[v].add(u);
                    for (int ch : child[u])
                        child[v].add(ch);
                    xor[v] ^= xor[u];
                }
                inDeg[v]--;
                if (inDeg[v] == 1 && !vis[v]) {
                    vis[v] = true;
                    q.add(v);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                int a = edges[i][0], b = edges[i][1];
                if (child[a].contains(b)) {
                    int t = a;
                    a = b;
                    b = t;
                }
                int c = edges[j][0], d = edges[j][1];
                if (child[c].contains(d)) {
                    int t = c;
                    c = d;
                    d = t;
                }

                int[] arr;
                if (child[a].contains(c))
                    arr = new int[] { xor[c], xor[a] ^ xor[c], total ^ xor[a] };
                else if (child[c].contains(a))
                    arr = new int[] { xor[a], xor[c] ^ xor[a], total ^ xor[c] };
                else
                    arr = new int[] { xor[a], xor[c], total ^ xor[a] ^ xor[c] };

                int max = Math.max(arr[0], Math.max(arr[1], arr[2]));
                int min = Math.min(arr[0], Math.min(arr[1], arr[2]));
                ans = Math.min(ans, max - min);
            }
        }
        return ans;
    }
}
