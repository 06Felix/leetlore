class Solution {
    public long countBadPairs(int[] nums) {
        Map<Integer, Long> m = new HashMap<>(); 
        long n = (long)nums.length;
        long good = -n;
        for(int i = 0 ; i < n ; i++)
            good += m.merge(nums[i] - i, 1L, Long :: sum);
        long total = n * (n - 1) / 2;
        return total - good;
    }
}
