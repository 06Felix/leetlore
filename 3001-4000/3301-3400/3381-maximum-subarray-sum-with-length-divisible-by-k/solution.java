class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = Long.MIN_VALUE;
        long cur = 0;
        long[] prf = new long[k];
        Arrays.fill(prf, Long.MAX_VALUE / 2);
        prf[k - 1] = 0;

        for (int i = 0; i < n; ++i) {
            cur += nums[i];
            ans = Math.max(ans, cur - prf[i % k]);
            prf[i % k] = Math.min(prf[i % k], cur);
        }

        return ans;
    }
}
