class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] dist1 = getDist(edges, node1, n);
        int[] dist2 = getDist(edges, node2, n);
        int minDist = 100000;
        int ans = -1;
        for (int i = 0; i < n; ++i)
            if (Math.min(dist1[i], dist2[i]) >= 0) {
                int mxDist = Math.max(dist1[i], dist2[i]);
                if (mxDist < minDist) {
                    minDist = mxDist;
                    ans = i;
                }
            }
        return ans;
    }
    private int[] getDist(int[] edges, int u, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        int d = 0;
        while (u != -1 && dist[u] == -1) {
            dist[u] = d++;
            u = edges[u];
        }
        return dist;
    }
}
