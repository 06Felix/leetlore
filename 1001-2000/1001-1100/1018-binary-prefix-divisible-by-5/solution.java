class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> ans = new ArrayList<>();
        int cur = 0;
        for (int num : nums) {
            cur <<= 1;
            cur |= num;
            cur %= 5;
            ans.add(cur == 0);
        }
        return ans;
    }
}
