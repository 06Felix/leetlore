class Solution {
    int M = (int) 1e9 + 7;
    public int idealArrays(int n, int maxValue) {
        long ans = 0;
        int N = n+maxValue;
        long[] inv = new long[N];
        long[] fact = new long[N];
        long[] invFact = new long[N];
        inv[1] = fact[0] = fact[1] = invFact[0] = invFact[1] = 1;
        for (int i = 2; i < N; i++){
            inv[i] = M - M / i * inv[M % i] % M;
            fact[i]=fact[i-1]*i%M;
            invFact[i] = invFact[i - 1] * inv[i] % M;
        }
        for (int i = 1; i <= maxValue; i++){
            int t = i;
            Map<Integer, Integer> m = new HashMap<>();
            for (int j = 2; j * j <= t; j++)
                while(t % j == 0) {
                    t /= j;
                    m.merge(j, 1, Integer::sum);
                }
            if (t > 1)
                m.merge(t, 1, Integer::sum);
            long gain = 1;
            for (int x : m.values()) {
                gain *= comb(n + x - 1, x, fact, invFact);
                gain %= M;
            }
            ans += gain;
            ans %= M;
        }
        return (int)ans;
    }
    private long comb(int a, int b, long[] fact, long[] invFact){
        return fact[a] * invFact[b] % M * invFact[a - b] % M;
    }
}
