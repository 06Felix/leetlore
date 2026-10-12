class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        int m = languages.length;
        BitSet[] dp = new BitSet[m + 1];
        for (int i = 0; i <= m; i++)
            dp[i] = new BitSet(n);
        for (int i = 0; i < m; i++)
            for (int lang : languages[i])
                dp[i + 1].set(lang - 1);
        Set<Integer> vis = new HashSet<>();
        for (int [] f : friendships){
            int u = f[0], v = f[1];
            BitSet inter = (BitSet) dp[u].clone();
            inter.and(dp[v]);
            if (inter.isEmpty()){
                vis.add(u);
                vis.add(v);
            }
        }
        if (vis.isEmpty())
            return 0;
        int[] ct = new int[n + 1];
        for (int u : vis)
            for (int lang = 1; lang <= n; lang++)
                if (dp[u].get(lang - 1))
                    ct[lang]++;
        int best = 0;
        for (int lang = 1; lang <= n; lang++)
            best = Math.max(best, ct[lang]);
        return vis.size() - best;
    }
}
