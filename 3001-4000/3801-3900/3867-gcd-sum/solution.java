class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pref = new int[n];
        int max = 0;

        for (int i = 0; i < n; ++i) {
            max = Math.max(max, nums[i]);
            pref[i] = gcd(nums[i], max);
        }

        Arrays.sort(pref);

        long ans = 0;
        for (int i = 0; i < n / 2; ++i)
            ans += gcd(pref[i], pref[n - 1 - i]);

        return ans;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
