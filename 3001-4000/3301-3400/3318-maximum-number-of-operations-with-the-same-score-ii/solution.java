class Solution {
    public int maxOperations(int[] nums) {
        int n = nums.length;
        int[][] memo = new int[n][n];
        return func(nums, 0, n - 1, 0, memo);
    }

    public int func(int[] nums, int start, int end, int lastSum, int[][] memo) {
        if (start >= end) {
            return 0;
        }

        if (memo[start][end] != 0) {
            return memo[start][end];
        }

        int res = 0;

        int firstTwoSum = nums[start] + nums[start + 1];
        int lastTwoSum = nums[end - 1] + nums[end];
        int firstLastSum = nums[start] + nums[end];
        if (firstTwoSum == lastSum || lastSum == 0) {
            res = Math.max(res, 1 + func(nums, start + 2, end, firstTwoSum, memo));
        }
        if (lastTwoSum == lastSum || lastSum == 0) {
            res = Math.max(res, 1 + func(nums, start, end - 2, lastTwoSum, memo));
        }
        if (firstLastSum == lastSum || lastSum == 0) {
            res = Math.max(res, 1 + func(nums, start + 1, end - 1, firstLastSum, memo));
        }

        memo[start][end] = res;
        return res;
    }
}
