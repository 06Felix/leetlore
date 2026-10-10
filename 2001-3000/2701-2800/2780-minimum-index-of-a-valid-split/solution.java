class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        Map<Integer, Integer> ct1 = new HashMap<>();
        Map<Integer, Integer> ct2 = new HashMap<>();
        for (int num : nums)
            ct2.merge(num, 1, Integer::sum);
        for (int i = 0; i < n; i++) {
            int f1 = ct1.merge(nums.get(i), 1, Integer::sum);
            int f2 = ct2.merge(nums.get(i), -1, Integer::sum);
            if (f1 * 2 > i + 1 && f2 * 2 > n - 1 - i)
                return i;
        }
        return -1;
    }
}
