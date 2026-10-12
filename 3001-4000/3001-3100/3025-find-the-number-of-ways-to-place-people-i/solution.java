class Solution {
    private boolean check (int[][] pts, int i, int j, int n) {
        if (pts[i][0] > pts[j][0])
            return false;
        for (int k = 0; k < n; k++)
            if (k != i && k != j)
                if (pts[i][0] <= pts[k][0] && pts[j][0] >= pts[k][0] && 
                    pts[i][1] >= pts[k][1] && pts[k][1] >= pts[j][1])
                    return false;
        return true;
    }
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points, (p1, p2) -> (p1[1] == p2[1] ? p1[0] - p2[0] : p2[1] - p1[1]));
        int ans = 0;
        int n = points.length;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (check(points, i, j, n))
                    ans++;
        return ans;
    }
}
