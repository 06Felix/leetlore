class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for (int x : nums)
            sum += x;
        int r = (int) (sum % p);
        if (r == 0)
            return 0;
        int n = nums.length;
        int ans = n;
        int ps = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        for (int i = 0; i < n; i++) {
            ps += nums[i];
            ps %= p;
            int tgt = (ps - r + p) % p;
            if (m.containsKey(tgt))
                ans = Math.min(ans, i - m.get(tgt));
            m.put(ps, i);
        }
        return ans == n ? -1 : ans;
    }
}
