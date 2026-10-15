class Solution {
    public int minCost(String colors, int[] neededTime) {
        int n = neededTime.length;
        int ans = 0, locMax = 0;
        for (int l = 0, r = 0; r < n;) {
            while (r < n && colors.charAt(r) == colors.charAt(l)) {
                ans += neededTime[r];
                locMax = Math.max(locMax, neededTime[r]);
                r++;
            }
            ans -= locMax;
            locMax = 0;
            l = r;
        }
        return ans;
    }
}
