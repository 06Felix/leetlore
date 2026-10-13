class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int mx = 0;
        for (int i = 0; i < n && i <= mx; i++) {
            if (i + 1 == n)
                return true;
            mx = mx > i + nums[i] ? mx : i + nums[i];
        }
        return false;
    }
}
