class Solution {
    public int maxSum(int[] nums, int k, int m) {
        int n = nums.length;
        int[] prf = new int[n + 1];
        for(int i = 0; i < n; i++)
            prf[i + 1] = prf[i] + nums[i];
        int[][] dp = new int[n + 1][k + 1];
        for(int[] row : dp)
            Arrays.fill(row, Integer.MIN_VALUE / 2);
        for(int i = 0; i <= n; i++)
            dp[i][0] = 0;
        for(int i = 1; i <= k; i++){
            int cur = Integer.MIN_VALUE / 2;
            for(int j = m; j <= n; j++){
                cur = Math.max(cur, dp[j - m][i - 1] - prf[j - m]);
                dp[j][i] = Math.max(prf[j] + cur, dp[j - 1][i]);
            }
        }
        return (int) dp[n][k];
    }
}
