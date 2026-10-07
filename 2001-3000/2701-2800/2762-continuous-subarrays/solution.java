class Solution {
    public long continuousSubarrays(int[] nums) {
        long ans = 1;
        int lt = nums[0] - 2;
        int rt = nums[0] + 2;
        int l = 0;
        for (int r = 1; r < nums.length; r++) {
            if (lt <= nums[r] && nums[r] <= rt) {
                lt = Math.max(lt, nums[r] - 2);
                rt = Math.min(rt, nums[r] + 2);
            } 
            else {
                lt = nums[r] - 2;
                rt = nums[r] + 2;
                l = r;
                while (nums[r] - 2 <= nums[l] && nums[l] <= nums[r] + 2) {
                lt = Math.max(lt, nums[l] - 2);
                rt = Math.min(rt, nums[l] + 2);
                --l;
                }
                ++l;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
