class Solution {
    public int longestSubsequence(int[] arr, int d) {
        Map<Integer, Integer> m = new HashMap<>();
        int ans = 0;
        for(int x : arr){
            m.put(x, m.getOrDefault(x - d, 0) + 1);
            ans = Math.max(ans, m.get(x));
        }
        return ans;
    }
}
