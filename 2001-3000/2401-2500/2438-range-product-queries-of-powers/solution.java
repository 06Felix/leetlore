class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int pow = 1, MOD = (int) 1e9 + 7;
        while (pow <= n)
            pow <<= 1;
        pow >>= 1;
        List<Integer> pows = new ArrayList<>();
        while (n > 0) {
            if (pow <= n) {
                pows.add(pow);
                n -= pow;
            }
            pow >>= 1;
        }
        n = pows.size();
        int[][] pfx = new int[n][n];
        for (int i = 0; i < n; i++) {
            pfx[i][i] = pows.get(n - 1 - i);
            for (int j = i + 1; j < n; j++)
                pfx[i][j] = (int)((1L * pfx[i][j - 1] * pows.get(n - 1 - j)) % MOD);
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++)
            ans[i] = pfx[queries[i][0]][queries[i][1]];
        return ans;
    }
}
