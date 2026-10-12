class Solution {
    public int sortPermutation(int[] nums) {
        int n = nums.length;
        int ans = (1 << 31) - 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i)
                ans &= i;
        }
        return ans == (1 << 31) - 1 ? 0 : ans;
    }
}
