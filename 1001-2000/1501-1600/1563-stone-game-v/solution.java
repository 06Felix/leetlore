class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[] pref = new int[n + 1];

        for (int i = 0; i < n; ++i)
            pref[i + 1] = pref[i] + stoneValue[i];

        int[][] dp = new int[n][n];

        for (int size = 2; size <= n; ++size) {
            for (int l = 0; l + size <= n; ++l) {
                int r = l + size - 1;

                for (int cut = l; cut < r; ++cut) {
                    int sum1 = pref[cut + 1] - pref[l];
                    int sum2 = pref[r + 1] - pref[cut + 1];

                    if (sum1 < sum2)
                        dp[l][r] = Math.max(dp[l][r], sum1 + dp[l][cut]);
                    else if (sum1 > sum2)
                        dp[l][r] = Math.max(dp[l][r], sum2 + dp[cut + 1][r]);
                    else
                        dp[l][r] = Math.max(dp[l][r], sum1 + Math.max(dp[l][cut], dp[cut + 1][r]));
                }
            }
        }

        return dp[0][n - 1];
    }
}
