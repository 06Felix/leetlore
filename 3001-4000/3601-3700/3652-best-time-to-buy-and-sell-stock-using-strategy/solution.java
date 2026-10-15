class Solution {
    private static final int MAX_SIZE = 100001;
    private static long[] prf = new long[MAX_SIZE];
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length, half = k / 2;
        Arrays.fill(prf, 0, n + 1, 0);
        for (int i = 0; i < n; i++)
            prf[i + 1] = prf[i] + (long) strategy[i] * prices[i];
        long curSum = 0;
        for (int i = half; i < k; i++)
            curSum += prices[i];
        long ans = Math.max(prf[n], curSum + prf[n] - prf[k]);
        for (int i = 1; i + k <= n; ++i) {
            curSum += prices[i + k - 1] - prices[i + half - 1];
            ans = Math.max(ans, curSum + prf[n] - prf[i + k] + prf[i]);
        }
        return ans;
    }
}
