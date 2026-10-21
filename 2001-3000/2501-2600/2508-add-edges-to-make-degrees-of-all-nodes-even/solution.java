class Solution {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        int[] deg = new int[n];
        Set<Integer>[] adj = new Set[n];
        for (int i = 0; i < n; ++i)
            adj[i] = new HashSet<>();

        for (List<Integer> edge : edges) {
            int u = edge.get(0) - 1;
            int v = edge.get(1) - 1;
            ++deg[u];
            ++deg[v];
            adj[u].add(v);
            adj[v].add(u);
        }

        List<Integer> oddDeg = new ArrayList<>();
        int oddCount = 0;
        for (int i = 0; i < n && oddCount < 5; ++i)
            if (deg[i] % 2 == 1) {
                oddDeg.add(i);
                ++oddCount;
            }

        switch (oddCount) {
            case 0:
                return true;
            case 2:
                int a = oddDeg.get(0);
                int b = oddDeg.get(1);
                for (int i = 0; i < n; ++i)
                    if (!adj[i].contains(a) &&
                        !adj[i].contains(b))
                        return true;
                return false;
            case 4:
                int o1 = oddDeg.get(0);
                int o2 = oddDeg.get(1);
                int o3 = oddDeg.get(2);
                int o4 = oddDeg.get(3);
                return (!adj[o1].contains(o2) && !adj[o3].contains(o4)) ||
                    (!adj[o1].contains(o3) && !adj[o2].contains(o4)) ||
                    (!adj[o1].contains(o4) && !adj[o3].contains(o2));
            default:
                return false;
        }
    }
}
