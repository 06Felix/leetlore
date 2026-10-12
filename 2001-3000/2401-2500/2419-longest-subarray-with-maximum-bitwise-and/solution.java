class Solution {
    public int longestSubarray(int[] nums) {
        int mx = nums[0];
        for (int x : nums)
            mx = Math.max(mx, x);
        int cur = 0;
        int ans = 0;
        for (int x : nums) {
            if (x == mx) {
                cur++;
                ans = Math.max(ans, cur);
            }
            else
                cur = 0;
        }
        return ans;
    }
}
