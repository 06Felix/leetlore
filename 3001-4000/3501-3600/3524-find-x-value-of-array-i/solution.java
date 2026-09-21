class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] ans = new long[k];
        long[] prev = new long[k];

        for (int num : nums) {
            long[] curr = new long[k];
            int val = num % k;

            ++curr[val];

            for (int i = 0; i < k; ++i)
                curr[(i * val) % k] += prev[i];

            for (int i = 0; i < k; ++i)
                ans[i] += curr[i];

            prev = curr;
        }

        return ans;
    }
}
