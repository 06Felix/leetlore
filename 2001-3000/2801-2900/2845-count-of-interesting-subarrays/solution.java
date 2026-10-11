class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {
        long ans = 0;
        int pf = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);
        for (int num : nums) {
            if (num % mod == k)
                pf = (pf + 1) % mod;
            ans += m.getOrDefault((pf - k + mod) % mod, 0);
            m.merge(pf, 1, Integer::sum);
        }
        return ans;
    }
}
