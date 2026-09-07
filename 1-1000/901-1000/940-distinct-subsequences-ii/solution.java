class Solution {
    private static final int MOD = 1_000_000_007;

    public int distinctSubseqII(String s) {
        long[] end = new long[26];

        for (char ch : s.toCharArray()) {
            int idx = ch - 'a';
            long sum = 1;

            for (int i = 0; i < 26; ++i)
                sum = (sum + end[i]) % MOD;

            end[idx] = sum;
        }

        long ans = 0;

        for (int i = 0; i < 26; ++i)
            ans = (ans + end[i]) % MOD;

        return (int) ans;
    }
}
