class Solution {
    private static final int MOD = 1_000_000_007;
    private static long[][] memo = new long[1001][1001];
    public int rearrangeSticks(int n, int k) {
        return (int) find(n, k);
    }
    private long find(int n, int k) {
        if (n == k)
            return 1L;
        if (k == 0)
            return 0L;
        if (memo[n][k] != 0)
            return memo[n][k];
        return memo[n][k] = (find(n - 1, k - 1) + find(n - 1, k) * (n - 1)) % MOD;
    }
}
