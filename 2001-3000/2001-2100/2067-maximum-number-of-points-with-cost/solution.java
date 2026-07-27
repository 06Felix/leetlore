class Solution {
  public long maxPoints(int[][] points) {
    int n = points[0].length;
    long[] dp = new long[n];

    for (int[] row : points) {
      long[] ltr = new long[n];
      long max = 0;

      for (int j = 0; j < n; ++j) {
        max = Math.max(max - 1, dp[j]);
        ltr[j] = max;
      }

      long[] rtl = new long[n];
      max = 0;

      for (int j = n - 1; j >= 0; --j) {
        max = Math.max(max - 1, dp[j]);
        rtl[j] = max;
      }

      for (int j = 0; j < n; ++j)
        dp[j] = Math.max(ltr[j], rtl[j]) + row[j];
    }

    long ans = -1;
    for(long x : dp)
        ans = Math.max(x, ans);
    return ans;
  }
}
