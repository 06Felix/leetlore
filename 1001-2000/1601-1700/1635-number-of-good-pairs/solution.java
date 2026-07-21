class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums){
            m.merge(n, 1, Integer::sum);
            ans += m.get(n) - 1;
        }
        return ans;
    }
}
