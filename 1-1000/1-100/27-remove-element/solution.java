class Solution {
    public int removeElement(int[] nums, int val) {
        int ct = 0;
        int cur = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++)
            if (nums[i] == val)
                ct++;
            else
                nums[cur++] = nums[i];
        return cur;
    }
}
