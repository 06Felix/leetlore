class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (p1, p2) -> (p1[1] == p2[1] ? p1[0] - p2[0] : p2[1] - p1[1]));
        int ans = 0;
        int n = points.length;
        for (int i = 0; i < n; i++) {
            int x = Integer.MAX_VALUE;
            int xi = points[i][0];
            for (int j = i + 1; j < n; j++) {
                int xj = points[j][0];
                if (xj >= xi && x > xj) {
                    ans++;
                    x = xj;
                    if (xi == xj)
                        break;
                }
            }
        }
        return ans;
    }
}
