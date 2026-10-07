class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = 0;
        int best = 0;
        for(int val : values){
            ans = Math.max(ans, best + val);
            best = Math.max(val, best) - 1;
        }
        return ans;
    }
}
