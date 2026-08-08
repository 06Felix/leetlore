class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] suf = new int[n + 1];

        int j = m - 1;
        int cnt = 0;

        for (int i = n - 1; i >= 0; --i) {
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                ++cnt;
                --j;
            }

            suf[i] = cnt;
        }

        int[] ans = new int[m];
        j = 0;
        boolean used = false;

        for (int i = 0; i < n && j < m; ++i) {
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                ++j;
            } else if (!used && suf[i + 1] >= m - j - 1) {
                ans[j] = i;
                ++j;
                used = true;
            }
        }

        if (j < m)
            return new int[0];

        return ans;
    }
}
