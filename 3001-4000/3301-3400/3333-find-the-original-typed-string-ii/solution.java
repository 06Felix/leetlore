class Solution {
    static final long MOD = 1_000_000_007;
    public int possibleStringCount(String word, int k) {
        int n = word.length();
        if (n == k)
            return 1;
        List<Integer> grp = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && word.charAt(j) == word.charAt(j - 1)) j++;
            grp.add(j - i);
            i = j;
        }
        int ct = grp.size();
        long[] prefix = new long[ct];
        prefix[ct - 1] = grp.get(ct - 1);
        for (i = ct - 2; i >= 0; i--)
            prefix[i] = (prefix[i + 1] * grp.get(i)) % MOD;
        if (ct >= k)
            return (int) prefix[0];
        long[][] dp = new long[ct][k - ct + 1];
        for (i = 0; i < k - ct + 1; i++)
            if (grp.get(ct - 1) + i + ct > k)
                dp[ct - 1][i] = grp.get(ct - 1) - (k - ct - i);
        for (i = ct - 2; i >= 0; i--) {
            long sum = (dp[i + 1][k - ct] * grp.get(i)) % MOD;
            for (int j = k - ct; j >= 0; j--) {
                sum += dp[i + 1][j];
                if (j + grp.get(i) > k - ct)
                    sum = (sum - dp[i + 1][k - ct] + MOD) % MOD;
                else
                    sum = (sum - dp[i + 1][j + grp.get(i)] + MOD) % MOD;
                dp[i][j] = sum;
            }
        }
        return (int) dp[0][0];
    }
}
