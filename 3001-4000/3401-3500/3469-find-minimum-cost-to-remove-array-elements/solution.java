class Solution {
    private long dfs(int i, int prv, int[] nums, int n, Map<Integer, Long>[] dp) {
        if (dp[i].containsKey(prv))
            return dp[i].get(prv);
        int rem = n - i + 1;
        long mn = Long.MAX_VALUE;
        if (rem < 3)
            mn = (rem == 1) ? prv : Math.max(prv, nums[i]);
        else {
            int a = prv, b = nums[i], c = nums[i + 1];
            long x = Math.max(b, c) + dfs(i + 2, a, nums, n, dp);
            long y = Math.max(a, c) + dfs(i + 2, b, nums, n, dp);
            long z = Math.max(a, b) + dfs(i + 2, c, nums, n, dp);
            mn = Math.min(x, Math.min(y, z));
        }
        dp[i].put(prv, mn);
        return mn;
    }

    public int minCost(int[] nums) {
        int n = nums.length;
        Map<Integer, Long>[] dp = new HashMap[n + 1];
        for (int i = 0; i <= n; i++)
            dp[i] = new HashMap<>();
        if (n == 0)
            return 0;
        if (n < 3)
            return (n == 1) ? nums[0] : Math.max(nums[0], nums[1]);
        int a = nums[0], b = nums[1], c = nums[2];
        long x = Math.max(b, c) + dfs(3, a, nums, n, dp);
        long y = Math.max(a, c) + dfs(3, b, nums, n, dp);
        long z = Math.max(a, b) + dfs(3, c, nums, n, dp);
        return (int) Math.min(x, Math.min(y, z));
    }
}
// 1 3 2 3 5 6 8 9 8
