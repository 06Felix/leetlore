class Solution {
    public int longestPalindromicSubsequence(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int[][][] dp = new int[n][n][k + 1];
        for (int i = 0; i < n; i++)
            for (int x = 0; x <= k; x++)
                dp[i][i][x] = 1;
        for (int l = 2; l <= n; l++) {
            for (int i = 0; i < n - l + 1; i++) {
                int j = i + l - 1;
                for (int x = 0; x <= k; x++) {
                    if (arr[i] == arr[j])
                        dp[i][j][x] = dp[i + 1][j - 1][x] + 2;
                    else {
                        int c1 = dp[i + 1][j][x];
                        int c2 = dp[i][j - 1][x];
                        int rep = Math.abs(arr[i] - arr[j]);
                        rep = Math.min(rep, 26 - rep);
                        int c3 = (x < rep) ? 0 : dp[i + 1][j - 1][x - rep] + 2;
                        dp[i][j][x] = Math.max(c1, Math.max(c2, c3));
                    }
                }
            }
        }
        return dp[0][n - 1][k];
    }
}
