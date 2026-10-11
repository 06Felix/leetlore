class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int j = -1;
        int mni = -1;
        int mxi = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                j = i;
            if (nums[i] == minK)
                mni = i;
            if (nums[i] == maxK)
                mxi = i;
            ans += Math.max(0, Math.min(mni, mxi) - j);
        }
        return ans;
    }
}
