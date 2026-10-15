class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        int ans = 0;
        int mx = -1;
        int mx2 = -1;

        Arrays.sort(intervals, (i1, i2) -> i1[1] == i2[1] ? i2[0] - i1[0] : i1[1] - i2[1]);
        for (int[] interval : intervals) {
            int st = interval[0];
            int end = interval[1];
            if (mx >= st && mx2 >= st)
                continue;
            if (mx >= st) {
                mx2 = mx;
                mx = end;
                ans += 1;
            } else {
                mx = end;
                mx2 = end - 1;
                ans += 2;
            }
        }

        return ans;
    }
}
