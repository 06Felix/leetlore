class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cur1 = 0, cur2 = 0;
        int ans = Integer.MIN_VALUE;
        for(int x : nums) {
            cur1 = Math.max(x, cur1 + x);
            cur2 = Math.min(x, cur2 + x);
            ans = Math.max(ans, Math.max(cur1, -cur2));
        }
        return ans;
    }
}
