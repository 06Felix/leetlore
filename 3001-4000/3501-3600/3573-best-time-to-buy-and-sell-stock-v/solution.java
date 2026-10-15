class Solution {
    public long maximumProfit(int[] prices, int k) {
        int x0 = prices[0], n = prices.length;
        long[][] dp = new long[k + 1][3];
        for (int t = 0; t <= k; t++)
            dp[t] = new long[] {0, -x0, x0};
        for (int i = 1; i < n; i++) {
            int x = prices[i];
            for (int t = k; t > 0; t--) {
                long[] cur = dp[t];
                long prevP = dp[t - 1][0];
                cur[0] = Math.max(cur[0], Math.max(cur[1] + x, cur[2] - x));
                cur[1] = Math.max(cur[1], prevP - x);
                cur[2] = Math.max(cur[2], prevP + x);
            }
        }
        return dp[k][0];
    }
}
