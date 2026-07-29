class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for(int x : nums3)
            for(int y : nums4)
                m.merge(x + y, 1, Integer::sum);
        for(int x : nums1)
            for(int y : nums2)
                ans += m.getOrDefault(-(x + y), 0);
        return ans;
    }
}
