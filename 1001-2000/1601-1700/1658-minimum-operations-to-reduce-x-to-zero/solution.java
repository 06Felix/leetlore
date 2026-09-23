class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;

        for (int num : nums)
            sum += num;

        int need = sum - x;

        if (need < 0)
            return -1;

        if (need == 0)
            return n;

        int left = 0;
        int curr = 0;
        int best = -1;

        for (int right = 0; right < n; ++right) {
            curr += nums[right];

            while (curr > need)
                curr -= nums[left++];

            if (curr == need)
                best = Math.max(best, right - left + 1);
        }

        return best == -1 ? -1 : n - best;
    }
}
