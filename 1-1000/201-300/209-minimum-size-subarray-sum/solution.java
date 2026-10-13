class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int ans = n + 1;
        int cur = 0;
        for (int l = 0, r = 0; r < n; r++) {
            cur += nums[r];
            if (cur < target)
                continue;
            while (cur >= target)
                cur -= nums[l++];
            ans = Math.min(ans, r - l + 2);
        }
        return ans == n + 1 ? 0 : ans;
    }
}
