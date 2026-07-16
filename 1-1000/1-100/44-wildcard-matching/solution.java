class Solution {
  public boolean isMatch(String s, String p) {
    final int m = s.length();
    final int n = p.length();
    // dp[i][j] := true if s[0..i) matches p[0..j)
    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;

    for (int j = 0; j < p.length(); ++j)
      if (p.charAt(j) == '*')
        dp[0][j + 1] = dp[0][j];

    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        if (p.charAt(j) == '*') {
          dp[i + 1][j + 1] = dp[i + 1][j] || dp[i][j + 1];
        } 
        else if (isMatch(s, i, p, j)) {
          dp[i + 1][j + 1] = dp[i][j];
        }

    return dp[m][n];
  }

  private boolean isMatch(String s, int i, String p, int j) {
    return j >= 0 && p.charAt(j) == '?' || s.charAt(i) == p.charAt(j);
  }
}
