class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0, mn = 999999, mx = -999999;
        for(List<Integer> l : arrays){
            ans = Math.max(ans, Math.max(l.get(l.size() - 1) - mn, mx - l.get(0)));
            mn = Math.min(mn, l.get(0));
            mx = Math.max(mx, l.get(l.size() - 1));
        }
        return ans;
    }
}
