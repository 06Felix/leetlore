class Solution {
    private static final int MOD = 1_000_000_007;
    public int numOfWays(int n) {
        long with2 = 6;
        long with3 = 6;
        for (int i = 1; i < n; ++i) {
            long nextWith2 = 3 * with2 + 2 * with3;
            long nextWith3 = 2 * with2 + 2 * with3;
            with2 = nextWith2 % MOD;
            with3 = nextWith3 % MOD;
        }
        return (int) ((with2 + with3) % MOD);
    }
}
