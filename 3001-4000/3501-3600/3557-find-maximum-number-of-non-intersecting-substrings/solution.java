class Solution {
    public int maxSubstrings(String word) {
        char[] str = word.toCharArray();
        int n = str.length;
        if (n < 4)
            return 0;
        int[] dp = new int[n + 1];
        int[] mx = new int[26];
        Arrays.fill(mx, Integer.MIN_VALUE);
        for(int i = 1; i <= n; i++){
            char end = str[i - 1];
            int r = end - 'a';
            dp[i] = dp[i - 1];
            if (i > 3){
                char st = str[i - 4];
                int l = st - 'a';
                if (mx[l] >= 0)
                    mx[l] = Math.max(mx[l], dp[i - 4]);
                else
                    mx[l] = dp[i - 4]; 
            }
            if (mx[r] >= 0)
                dp[i] = Math.max(dp[i], mx[r] + 1);
        }
        return dp[n];
    }
}
