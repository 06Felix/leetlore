class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int len = m + n - 1;

        if ((len & 1) == 1 || grid[0][0] == ')' || grid[m - 1][n - 1] == '(')
            return false;

        boolean[][] dp = new boolean[n][len + 1];
        dp[0][0] = true;

        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                boolean[] curr = new boolean[len + 1];
                int diff = grid[i][j] == '(' ? 1 : -1;
                int remain = m + n - i - j - 2;

                for (int bal = 0; bal < len; ++bal) {
                    int next = bal + diff;

                    if (next < 0 || next > remain)
                        continue;

                    if (dp[j][bal] || (j > 0 && dp[j - 1][bal]))
                        curr[next] = true;
                }

                dp[j] = curr;
            }
        }

        return dp[n - 1][0];
    }
}
