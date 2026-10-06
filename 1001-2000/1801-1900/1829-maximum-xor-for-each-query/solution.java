class Solution {
    public int[] getMaximumXor(int[] nums, int mBit) {
        int n = nums.length;
        int[] ans = new int[n];
        int req = (1 << mBit) - 1;
        int cur = 0;
        for(int i = n - 1 ; i >= 0 ; i--){
            cur ^= nums[n - i - 1];
            ans[i] = cur ^ req;
        }
        return ans;
    }
}
