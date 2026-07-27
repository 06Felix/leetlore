class Solution {
    public boolean canReachCorner(int xCorner, int yCorner, int[][] circles) {
        int n = circles.length;
        DisjointSet ds = new DisjointSet(n + 3);
        int topBoundary = n;
        int rightBoundary = n + 1;
        int bottomBoundary = n + 2;
        int leftBoundary = n + 3;

        for (int i = 0; i < n; i++) {
            int xi = circles[i][0];
            int yi = circles[i][1];
            int ri = circles[i][2];
            if (yi - ri >= yCorner || xi - ri >= xCorner) {
                continue;
            }
            if (((xi > (xCorner + yCorner) || yi > yCorner) && (xi > xCorner || yi > xCorner + yCorner))) {
                continue;
            }
            if (xi <= ri) {
                ds.union(i, leftBoundary);
            }
            if (yi <= ri) {
                ds.union(i, topBoundary);
            }
            if (xCorner - xi <= ri) {
                ds.union(i, rightBoundary);
            }
            if (yCorner - yi <= ri) {
                ds.union(i, bottomBoundary);
            }
        }
        for (int i = 0; i < n; i++) {
            int x1 = circles[i][0];
            int y1 = circles[i][1];
            int r1 = circles[i][2];
            if (y1 - r1 >= yCorner || x1 - r1 >= xCorner) {
                continue;
            }
            if (((x1 > (xCorner + yCorner) || y1 > yCorner) && (x1 > xCorner || y1 > xCorner + yCorner))) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                int x2 = circles[j][0];
                int y2 = circles[j][1];
                int r2 = circles[j][2];
                double dist = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
                if (dist <= (r1 + r2)) {
                    ds.union(i, j);
                }
            }
        }

        // Check if left is connected to right or top is connected to bottom
        if (ds.find(leftBoundary) == ds.find(rightBoundary) ||
            ds.find(leftBoundary) == ds.find(topBoundary)) {
            return false;
        }
        return (ds.find(bottomBoundary) != ds.find(rightBoundary) &&
                ds.find(bottomBoundary) != ds.find(topBoundary));
    }

    private class DisjointSet {
        private int[] parent;
        private int[] size;

        public DisjointSet(int n) {
            size = new int[n + 1];
            parent = new int[n + 1];
            Arrays.fill(size, 1);
            for (int i = 0; i <= n; i++) {
                parent[i] = i;
            }
        }

        public int find(int u) {
            if (u == parent[u]) {
                return u;
            }
            parent[u] = find(parent[u]);
            return parent[u];
        }

        public void union(int u, int v) {
            int rootU = find(u);
            int rootV = find(v);
            if (rootU == rootV) {
                return;
            }
            if (size[rootU] < size[rootV]) {
                parent[rootU] = rootV;
                size[rootV] += size[rootU];
            } else {
                parent[rootV] = rootU;
                size[rootU] += size[rootV];
            }
        }
    }
}
