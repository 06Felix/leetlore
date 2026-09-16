class Solution {
    private static final int MOD = 1_000_000_007;

    public int numberOfSets(int n, int k) {
        int[][] dp = new int[n][k + 1];

        for (int i = 0; i < n; ++i)
            dp[i][0] = 1;

        for (int cnt = 1; cnt <= k; ++cnt) {
            long sum = 0;

            for (int i = 1; i < n; ++i) {
                sum = (sum + dp[i - 1][cnt - 1]) % MOD;
                dp[i][cnt] = (int) ((dp[i - 1][cnt] + sum) % MOD);
            }
        }

        return dp[n - 1][k];
    }
}
