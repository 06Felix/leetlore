class Solution {
    public int maximumLength(int[] nums, int k) {
        int ans = 2;
        int n = nums.length;
        for (int j = 0; j < k; j++) {
            int[] dp = new int[k];
            for (int i = 0; i < n; i++) {
                int mod = nums[i] % k;
                int pos = (j - mod + k) % k;
                dp[mod] = dp[pos] + 1;
            }
            for (int val : dp)
                ans = Math.max(ans, val);
        }
        return ans;
    }
}
