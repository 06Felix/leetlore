class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 1;
        int mn = nums[0];
        int n = nums.length;
        for (int i = 1; i < n; ++i)
            if (mn + k < nums[i]) {
                ++ans;
                mn = nums[i];
            }
        return ans;
    }
}
