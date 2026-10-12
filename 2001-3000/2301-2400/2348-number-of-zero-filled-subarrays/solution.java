class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        long ct = 0;
        for (int x : nums) {
            if (x == 0)
                ct++;
            else {
                ans += ct * (ct + 1) / 2;
                ct = 0;
            }
        }
        ans += ct * (ct + 1) / 2;
        return ans;
    }
}
