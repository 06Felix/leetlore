class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int cur = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        for (int i = 0; i < nums.length; ++i) {
            cur += nums[i];
            if (k != 0)
                cur %= k;
            if (m.containsKey(cur)) {
                if (i - m.get(cur) > 1)
                    return true;
            } else
                m.put(cur, i);
        }
        return false;
    }
}
