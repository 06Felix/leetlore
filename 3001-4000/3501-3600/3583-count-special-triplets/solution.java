class Solution {
    private static int mod = 1_000_000_007;
    private static int max_n = 100001;
    public int specialTriplets(int[] nums) {
        long ans = 0;
        int n = nums.length;
        int[] ct = new int[max_n];
        int[] prv = new int[max_n];
        for (int i = 0; i < n; i++)
            ct[nums[i]]++;
        for (int i = 1; i < n - 1; i++) {
            prv[nums[i - 1]]++;
            int j = nums[i], k = 2 * j;
            if (k < max_n)
                ans += (long) prv[k] * (ct[k] - prv[k] - (j == 0 ? 1 : 0));
        }
        return (int) (ans % mod);
    }
}
