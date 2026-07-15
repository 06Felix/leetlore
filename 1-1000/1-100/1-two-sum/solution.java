class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j = 1;
        int n = nums.length;
        while (j < n) {
            for (int i = 0; i + j < n; i++)
                if (target == nums[i] + nums[i + j])
                    return new int[]{i, i + j};
            j++;
        }
        return new int[]{6, 7};
    }
}
