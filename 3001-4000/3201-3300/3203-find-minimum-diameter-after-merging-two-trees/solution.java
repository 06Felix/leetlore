class Solution {
    public int minimumDiameterAfterMerge(int[][] arr1, int[][] arr2) {
        int d1 = getDiameter(arr1);
        int d2 = getDiameter(arr2);
        int d3 = (d1 + 1) / 2 + (d2 + 1) / 2 + 1;
        return Math.max(Math.max(d1, d2), d3);
    }
    private int getDiameter(int[][] arr) {
        int n = arr.length + 1;
        List<Integer>[] adj = new List[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();
        for (int[] e : arr) {
            int u = e[0];
            int v = e[1];
            adj[u].add(v);
            adj[v].add(u);
        }
        int[] mxD = new int[1];
        find(adj, 0, -1, mxD);
        return mxD[0];
    }
    private int find(List<Integer>[] adj, int u, int prev, int[] mxD) {
        int md1 = 0;
        int md2 = 0;
        for (int v : adj[u]) {
            if (v == prev)
                continue;
            int maxSubDepth = find(adj, v, u, mxD);
            if (maxSubDepth > md1) {
                md2 = md1;
                md1 = maxSubDepth;
            }
            else if (maxSubDepth > md2)
                md2 = maxSubDepth;
        }
        mxD[0] = Math.max(mxD[0], md1 + md2);
        return md1 + 1;
    }
}
