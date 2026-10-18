class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int[] ct = new int[101];
        for (int num : nums)
            ++ct[num];
        for (int i = 1; i <= 100; ++i)
            ct[i] += ct[i - 1];
        for (int i = 0; i < nums.length; ++i)
            ans[i] = nums[i] == 0 ? 0 : ct[nums[i] - 1];
        return ans;
    }
}
