class Solution {
    public int minValidStrings(String[] words, String target) {
    int ans = 0;
        int req = target.length();
        int[][] lpsList = new int[words.length][];
        for (int i = 0; i < words.length; ++i)
            lpsList[i] = getLPS(words[i] + '#' + target);
        while (req > 0) {
            int mx = 0;
            for (int i = 0; i < words.length; ++i)
                mx = Math.max(mx, lpsList[i][words[i].length() + req]);
            if (mx == 0)
                return -1;
            ans++;
            req -= mx;
        }
        return ans;
    }
    private int[] getLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        for (int i = 1, j = 0; i < pattern.length(); ++i) {
            while (j > 0 && pattern.charAt(j) != pattern.charAt(i))
                j = lps[j - 1];
            if (pattern.charAt(i) == pattern.charAt(j))
                lps[i] = ++j;
        }
        return lps;
    }
}
