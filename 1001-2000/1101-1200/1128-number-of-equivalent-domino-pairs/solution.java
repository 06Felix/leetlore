class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> ct = new HashMap<>();
        int ans = 0;
        for (int[] domino : dominoes) {
            int k = Math.min(domino[0], domino[1]) * 10 + Math.max(domino[0], domino[1]);
            ans += ct.getOrDefault(k, 0);
            ct.merge(k, 1, Integer::sum);
        }
        return ans;
    }
}
