class Solution {
    public int longestSubarray(int[] nums) {
        int ct = 0;
        int ans = 0;
        int n = nums.length;
        for (int l = 0, r = 0; r < n; r++) {
            if (nums[r] == 0)
                ct++;
            while (ct >= 2)
                if (nums[l++] == 0)
                    ct--;
            ans = Math.max(ans, r - l);
        }
        return ans;
    }
}
