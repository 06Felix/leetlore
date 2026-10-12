class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] ans = new int[nums.length / 3][3];
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 2; i < n; i += 3) {
            if (nums[i] - nums[i - 2] > k)
                return new int[0][];
            ans[i / 3] = new int[] {nums[i - 2], nums[i - 1], nums[i]};
        }
        return ans;
    }
}
