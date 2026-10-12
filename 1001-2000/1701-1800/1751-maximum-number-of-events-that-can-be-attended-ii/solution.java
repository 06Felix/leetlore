class Solution {
    public int maxValue(int[][] events, int k) {
        int n = events.length;
        Arrays.sort(events, (e1, e2) -> (e1[0] - e2[0]));
        int[] st = new int[n];
        int[] nxt = new int[n];
        for (int i = 0; i < n; ++i)
            st[i] = events[i][0];
        for (int i = 0; i < n; ++i)
            nxt[i] = Arrays.binarySearch(st, events[i][1] + 1) < 0
                ? -Arrays.binarySearch(st, events[i][1] + 1) - 1
                : upperBound(st, events[i][1]);
        long[] prv = new long[n+1], cur;
        for (int i = n - 1; i >= 0; --i)
            prv[i] = Math.max(prv[i + 1], events[i][2]);
        long ans = prv[0];
        for (int t = 2; t <= k; ++t) {
            cur = new long[n+1];
            for (int i = n - 1; i >= 0; --i) {
                long take = events[i][2];
                int j = nxt[i];
                if (j <= n) take += prv[j];
                cur[i] = Math.max(cur[i + 1], take);
            }
            ans = Math.max(ans, cur[0]);
            prv = cur;
        }
        return (int)ans;
    }

    private int upperBound(int[] a, int key) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) >>> 1;
            if (a[m] <= key)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }
}
