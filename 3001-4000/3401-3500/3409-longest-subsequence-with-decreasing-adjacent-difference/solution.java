class Solution {
    public int longestSubsequence(int[] nums) {
        int mx = 0;
        for(int x : nums)
            mx = Math.max(mx, x);
        int[][] dp = new int[mx + 1][mx + 1];
        int ans = 0;
        for(int num : nums){
            for(int i = 1 ; i <= mx ; i++){
                int dif = Math.abs(num - i);
                dp[num][dif] = Math.max(dp[num][dif], dp[i][dif] + 1);
            }
            for(int i = mx - 1 ; i >= 0 ; i--)
                dp[num][i] = Math.max(dp[num][i], dp[num][i + 1]);
            ans = Math.max(ans, dp[num][0]);
        }
        // for(int x : nums)
        return ans;
    }
}
