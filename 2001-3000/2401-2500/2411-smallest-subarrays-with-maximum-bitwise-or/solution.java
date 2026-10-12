class Solution {
    public int[] smallestSubarrays(int[] nums) {
        int n = nums.length;
        int[] ans = new int[nums.length];
        for (int i = 0; i < n; i++) {
            int bit = nums[i];
            ans[i] = 1;
            for (int j = i - 1; j >= 0 && (nums[j] | bit) != nums[j]; j--) {
                nums[j] |= bit;
                ans[j] = i - j + 1;
            }
        }
        return ans;
    }
}
