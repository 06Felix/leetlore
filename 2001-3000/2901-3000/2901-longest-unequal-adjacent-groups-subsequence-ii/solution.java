class Solution {
    public List<String> getWordsInLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int[] prv = new int[n];
        Arrays.fill(prv, -1);
        for (int i = 1; i < n; ++i)
            for (int j = 0; j < i; ++j) {
                if (groups[i] == groups[j])
                    continue;
                if (words[i].length() != words[j].length())
                    continue;
                if (hD(words[i], words[j]) != 1)
                    continue;
                if (dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prv[i] = j;
                }
            }
        int id = mxI(dp);
        while (id != -1) {
            ans.add(words[id]);
            id = prv[id];
        }
        Collections.reverse(ans);
        return ans;
    }
    private int hD(final String s1, final String s2) {
        int dt = 0;
        for (int i = 0; i < s1.length(); ++i)
            if (s1.charAt(i) != s2.charAt(i))
                ++dt;
        return dt;
    }
    private int mxI(int[] dp) {
        int mx = 0;
        for (int i = 0; i < dp.length; ++i)
            if (dp[i] > dp[mx])
                mx = i;
        return mx;
    }
}
