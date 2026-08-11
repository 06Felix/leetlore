class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[101];
        int sum = nums[0];

        seen[nums[0]] = true;

        int i = 1;

        while (i < n && nums[i] == nums[i - 1] + 1) {
            sum += nums[i];
            seen[nums[i]] = true;
            ++i;
        }

        while (i < n) {
            seen[nums[i]] = true;
            ++i;
        }

        while (sum < 101 && seen[sum])
            ++sum;

        return sum;
    }
}
