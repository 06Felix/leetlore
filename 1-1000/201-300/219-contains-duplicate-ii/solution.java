class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            Integer prv = m.put(nums[i], i);
            if (prv != null && i - prv <= k)
                return true;
        }
        return false;
    }
}
