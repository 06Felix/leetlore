class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        for(int[] d : dp)
            Arrays.fill(d, -1);
        int[] suf = new int[n];
        suf[n - 1] = piles[n - 1];
        for(int i = n - 2 ; i >= 0 ; i--)
            suf[i] = suf[i + 1] + piles[i];
        return find(dp, 0, 1, suf);
    }
    private int find(int[][] dp, int i, int m, int[] suf){
        if(i + 2 * m >= suf.length)
            return suf[i];
        if(dp[i][m] != -1)
            return dp[i][m];
        int enemy = suf[i];
        for(int x = 1 ; x <= 2 * m ; x++)
            enemy = Math.min(enemy, find(dp, i + x, Math.max(m, x), suf));
        return dp[i][m] = suf[i] - enemy;
    }
}
