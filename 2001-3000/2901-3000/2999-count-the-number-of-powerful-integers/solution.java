class Solution {
    private Long[][] dp;
    private String sfx;
    private int lim;
    public long numberOfPowerfulInt(long start, long finish, int lim, String sfx) {
        this.lim = lim;
        this.sfx = sfx;
        long ctf = find(finish);
        long cts = find(start - 1);
        return ctf - cts;
    }
    private long find(long num) {
        if (num < Long.parseLong(sfx))
            return 0;
        String str = Long.toString(num);
        dp = new Long[str.length()][2];
        return dfs(0, true, str);
    }
    private long dfs(int idx, boolean tight, String num) {
        if (idx == num.length())
            return 1L;
        if (dp[idx][tight ? 1 : 0] != null)
            return dp[idx][tight ? 1 : 0];
        long ans = 0;
        int mx = tight ? num.charAt(idx) - '0' : 9;
        int st = num.length() - sfx.length();
        if (idx >= st) {
            int sfxIdx = idx - st;
            int dig = sfx.charAt(sfxIdx) - '0';
            if (dig <= mx && dig <= lim)
                ans += dfs(idx + 1, tight && dig == mx, num);
        }
        else
            for (int d = 0; d <= Math.min(mx, lim); d++)
                ans += dfs(idx + 1, tight && d == mx, num);
        return dp[idx][tight ? 1 : 0] = ans;
    }
}
