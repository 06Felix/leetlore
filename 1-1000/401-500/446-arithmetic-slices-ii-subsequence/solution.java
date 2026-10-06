class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int[][] dp = new int[n][n];
        Map<Long, List<Integer>> m = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            m.putIfAbsent((long) nums[i], new ArrayList<>());
            m.get((long) nums[i]).add(i);
        }
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < i; ++j) {
                long req = nums[j] * 2L - nums[i];
                if (m.containsKey(req))
                    for (int k : m.get(req))
                        if (k < j)
                            dp[i][j] += dp[j][k] + 1;
                ans += dp[i][j];
            }
        return ans;
    }
}
