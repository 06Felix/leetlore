class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        if (m == 0)
            return 0L;
        long[] prf = new long[n];
        for (int i = 0; i < n; ++i)
            prf[i] = skill[i] + (i > 0 ? prf[i - 1] : 0L);
        long ans = 0L;
        for (int j = 1; j < m; ++j) {
            long best = Long.MIN_VALUE;
            long prv = (long) mana[j - 1];
            long cur = (long) mana[j];
            for (int i = 0; i < n; ++i) {
                long prv_prf = (i > 0 ? prf[i - 1] : 0L);
                long cand = prf[i] * prv - prv_prf * cur;
                if (cand > best)
                    best = cand;
            }
            ans += best;
        }
        return ans + prf[n - 1] * (long) mana[m - 1];
    }
}
