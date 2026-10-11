class Solution {
    private int MOD = 1_000_000_007;
    private int m;
    private int n;
    private int[][] mem = new int[1000][1024];
    private int dp(int r, int c, int prevColMask, int currColMask) {
        if (c == n)
            return 1;
        if (mem[c][prevColMask] != 0)
            return mem[c][prevColMask];
        if (r == m)
            return dp(0, c + 1, currColMask, 0);
        int ans = 0;
        for (int color = 1; color <= 3; ++color) {
            if (getCol(prevColMask, r) == color)
                continue;
            if (r > 0 && getCol(currColMask, r - 1) == color)
                continue;
            ans += dp(r + 1, c, prevColMask, setCol(currColMask, r, color));
            ans %= MOD;
        }
        if (r == 0)
            mem[c][prevColMask] = ans;
        return ans;
    }
    private int getCol(int mask, int r) {
        return mask >> r * 2 & 3;
    }
    private int setCol(int mask, int r, int color) {
        return mask | color << r * 2;
    }
    public int colorTheGrid(int m, int n) {
        this.m = m;
        this.n = n;
        return dp(0, 0, 0, 0);
    }
}
