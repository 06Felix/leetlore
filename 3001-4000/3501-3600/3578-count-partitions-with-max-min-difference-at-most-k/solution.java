class Solution {
    private static int MOD = 1_000_000_007;
    public int countPartitions(int[] nums, int k) {
        int n = nums.length;
        long[] dp = new long[n + 1];
        long[] pref = new long[n + 1];
        dp[0] = 1;
        pref[0] = 1;

        Deque<Integer> minD = new ArrayDeque<>();
        Deque<Integer> maxD = new ArrayDeque<>();

        int l = 0;
        for (int r = 0; r < n; r++) {
            while (!minD.isEmpty() && nums[minD.peekLast()] > nums[r])
                minD.pollLast();
            minD.addLast(r);
            while (!maxD.isEmpty() && nums[maxD.peekLast()] < nums[r])
                maxD.pollLast();
            maxD.addLast(r);

            while (nums[maxD.peekFirst()] - nums[minD.peekFirst()] > k) {
                if (minD.peekFirst() == l)
                    minD.pollFirst();
                if (maxD.peekFirst() == l)
                    maxD.pollFirst();
                l++;
            }

            long sum = (pref[r] - (l == 0 ? 0 : pref[l - 1]) + MOD) % MOD;
            dp[r + 1] = sum;
            pref[r + 1] = (pref[r] + dp[r + 1]) % MOD;
        }

        return (int) dp[n];
    }
}
