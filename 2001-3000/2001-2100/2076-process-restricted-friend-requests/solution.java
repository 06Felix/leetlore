class DSU {
    int[] parent, size;

    DSU(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    void union(int a, int b) {
        int ra = find(a);
        int rb = find(b);
        if (ra == rb)
            return;
        if (size[ra] < size[rb]) {
            parent[ra] = rb;
            size[rb] += size[ra];
        } else {
            parent[rb] = ra;
            size[ra] += size[rb];
        }
    }
}

class Solution {
    public boolean[] friendRequests(int n, int[][] restrictions, int[][] requests) {
        DSU dsu = new DSU(n);
        int m = requests.length;
        boolean[] ans = new boolean[m];

        for (int i = 0; i < m; i++) {
            int u = requests[i][0];
            int v = requests[i][1];

            int ru = dsu.find(u);
            int rv = dsu.find(v);
            boolean found = true;
            if (ru != rv) {
                for (int[] r : restrictions) {
                    int a = dsu.find(r[0]);
                    int b = dsu.find(r[1]);
                    if ((a == ru && b == rv) || (a == rv && b == ru)) {
                        found = false;
                        break;
                    }
                }
            }
            if (found) {
                dsu.union(u, v);
                ans[i] = true;
            } else {
                ans[i] = false;
            }
        }
        return ans;
    }
}
