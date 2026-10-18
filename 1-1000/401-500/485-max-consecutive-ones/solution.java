class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for (int x : nums) {
            if (x == 1)
                ++ans;
            else {
                count = Math.max(count, ans);
                ans = 0;
            }
        }
        count = Math.max(ans, count);
        return count;
    }
}
