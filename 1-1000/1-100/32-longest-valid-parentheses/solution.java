class Solution {
    public int longestValidParentheses(String s) {
        String s2 = "#" + s;
        int dp[] = new int[s2.length()];
        for (int i = 1; i < s2.length(); i++)
            if (s2.charAt(i) == ')' && s2.charAt(i - dp[i - 1] - 1) == '(')
                dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
        int ans = 0;
        for(int x : dp)
            ans = Math.max(ans, x);
        return ans;
    }
}
