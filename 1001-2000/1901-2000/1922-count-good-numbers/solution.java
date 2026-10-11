class Solution {
    private int MOD = 1000000007;
    private long pow(long x, long n) {
        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return x * pow(x, n - 1) % MOD;
        return pow(x * x % MOD, n / 2);
    }
    public int countGoodNumbers(long n) {
        return (int) (pow(4 * 5, n / 2) * (n % 2 == 0 ? 1 : 5) % MOD);
    }
}
