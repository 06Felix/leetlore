class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int l = nums[0] + k;
        int r = nums[n - 1] - k;
        int ans = nums[n - 1] - nums[0];
        for(int i = 0 ; i < n - 1 ; i++){
            int mn = Math.min(l, nums[i + 1] - k);
            int mx = Math.max(r, nums[i] + k);
            ans = Math.min(ans, mx - mn);
        }
        return ans;
    }
}
