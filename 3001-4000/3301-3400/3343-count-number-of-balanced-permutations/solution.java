class Solution {
    private static final int MOD = 1000000007;
    private static final int MAX = 100;
    private long[] F = new long[MAX];
    private long[] I = new long[MAX];
    private Map<String, Long> memo = new HashMap<>();
    Solution() {
        F[0] = 1;
        for (int i = 1; i < MAX; i++)
            F[i] = F[i - 1] * i % MOD;
        for (int i = 0; i < MAX; i++)
            I[i] = pow(F[i], MOD - 2, MOD);
    }
    private long pow(long base, long exp, long mod) {
        long ans = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                ans = ans * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        return ans;
    }
    private long f(int i, int d, int m, int n, int[] a, int s, int t) {
        if (m > s || n > t)
            return 0;
        if (i == 10)
            return d == 0 ? 1 : 0;
        String key = i + "," + d + "," + m + "," + n;
        if (memo.containsKey(key))
            return memo.get(key);
        long r = 0;
        for (int j = 0; j <= a[i]; j++) {
            int k = a[i] - j;
            r += I[j] * I[k] % MOD * f(i + 1, d + i * (j - k), m + j, n + k, a, s, t) % MOD;
            r %= MOD;
        }
        memo.put(key, r);
        return r;
    }

    public int countBalancedPermutations(String num) {
        int[] a = new int[10];
        for (char c : num.toCharArray())
            a[c - '0']++;
        int s = (num.length() + 1) / 2;
        int t = num.length() / 2;
        return (int) (F[s] * F[t] % MOD * f(0, 0, 0, 0, a, s, t) % MOD);
    }
}
