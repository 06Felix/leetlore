class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        int ct = (nums.length >> 1);
        for (int x : nums)
            if (m.merge(x, 1, Integer::sum) > ct)
                return x;
        return 67;
    }
}
