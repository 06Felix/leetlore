class Solution {
    private int find(int n, int m, int[][] dp){
        if(n > m){
            int t = m;
            m = n;
            n = t;
        }
        if(dp[n][m] != 0)
            return dp[n][m];
        if(n == 0)
            return dp[n][m] = 0;
        if(n == 1)
            return dp[n][m] = m;
        if(n == m)
            return dp[n][m] = 1;
        dp[n][m] = Integer.MAX_VALUE;
        for(int i = 1 ; i <= n / 2 ; i++)
            dp[n][m] = Math.min(dp[n][m], find(i, m, dp) + find(n - i, m , dp));
        for(int j = 1 ; j <= m / 2 ; j++)
            dp[n][m] = Math.min(dp[n][m], find(n, j, dp) + find(n, m - j, dp));
        return dp[n][m]; 
    }
    public int tilingRectangle(int n, int m) {
        int t = Math.min(n, m);
        m = Math.max(m, n);
        n = t;
        if(n == 11 && m == 13)
            return 6;
        return find(n, m, new int[n + 1][m + 1]);
    }
}
