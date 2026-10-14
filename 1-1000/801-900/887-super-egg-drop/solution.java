class Solution {
    public int superEggDrop(int n, int k) {
        int[] dp = new int[n + 1];
        int cnt = 0;
        while (dp[n] < k) {
            cnt++;
            for (int i = n; i > 0; i--) {
                dp[i] += 1 + dp[i - 1];
            }
        }
        return cnt;
    }
}
