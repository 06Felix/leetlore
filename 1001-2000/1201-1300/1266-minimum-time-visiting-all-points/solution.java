class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int ans = 0;
        for (int i = 1; i < n; ++i) {
            int dy = Math.abs(points[i][1] - points[i - 1][1]);
            int dx = Math.abs(points[i][0] - points[i - 1][0]);
            ans += Math.max(dy, dx);
        }
        return ans;
    }
}
