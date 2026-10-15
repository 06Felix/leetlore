class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[] sfx = new int[n];
        sfx[n - 1] = events[n - 1][2];
        for (int i = n - 2; i >= 0; --i)
            sfx[i] = Math.max(events[i][2], sfx[i + 1]);
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int l = i + 1, r = n - 1;
            int nxt = -1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (events[mid][0] > events[i][1]) {
                    nxt = mid;
                    r = mid - 1;
                }
                else
                    l = mid + 1;
            }
            if (nxt != -1)
                ans = Math.max(ans, events[i][2] + sfx[nxt]);
            ans = Math.max(ans, events[i][2]);
        }
        return ans;
    }
}
