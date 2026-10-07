class Solution {
    private int mod = 1000000007;
    public int countVowelPermutation(int n) {
        long[] dp = new long[]{1L, 1L, 1L, 1L, 1L};
        for(int i = 1 ; i < n ; i++){
            long[] nxt = new long[5];
            nxt[0] = (dp[1] + dp[2] + dp[4]) % mod;
            nxt[1] = (dp[0] + dp[2]) % mod;
            nxt[2] = (dp[1] + dp[3]) % mod;
            nxt[3] = dp[2];
            nxt[4] = (dp[2] + dp[3]) % mod;
            dp = nxt;
        }
        long ans = 0;
        for(long x : dp)
            ans = (ans + x) % mod;
        return (int) ans;
    }
}
