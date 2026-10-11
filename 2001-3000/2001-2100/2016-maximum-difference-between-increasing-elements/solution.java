class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int mn = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; ++i) {
            if (nums[i] > mn)
                ans = Math.max(ans, nums[i] - mn);
            mn = Math.min(mn, nums[i]);
        }
        return ans;
    }
}
