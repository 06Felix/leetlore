class Solution {
    public int numWays(String[] words, String target) {
        int mod = 1000000007;
        int len = words[0].length();
        int rLen = target.length();
        long[] dp = new long[rLen + 1];
        dp[0] = 1;
        for (int j = 0; j < len; j++) {
            int[] ct = new int[26];
            for (String word : words)
                ct[word.charAt(j) - 'a']++;
            for (int i = rLen; i > 0; i--) {
                dp[i] += dp[i - 1] * ct[target.charAt(i - 1) - 'a'];
                dp[i] %= mod;
            }
        }
        return (int)dp[rLen];
    }
}
