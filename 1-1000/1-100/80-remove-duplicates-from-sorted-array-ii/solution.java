class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int cur = 2;
        for (int i = 2; i < n; i++)
            if (nums[i] != nums[cur - 2])
                nums[cur++] = nums[i];
        return cur;
    }
}
