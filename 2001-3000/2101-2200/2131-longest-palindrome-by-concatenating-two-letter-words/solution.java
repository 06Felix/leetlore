class Solution {
    public int longestPalindrome(String[] words) {
        int ans = 0;
        int[][] ct = new int[26][26];
        for (String w : words) {
            int i = w.charAt(0) - 'a';
            int j = w.charAt(1) - 'a';
            if (ct[j][i] > 0) {
                ans += 4;
                --ct[j][i];
            }
            else
                ct[i][j]++;
        }
        for (int i = 0; i < 26; ++i)
            if (ct[i][i] > 0)
                return ans + 2;
        return ans;
    }
}
