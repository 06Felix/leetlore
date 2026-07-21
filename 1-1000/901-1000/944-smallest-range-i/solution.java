class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        for(int n : nums){
            mx = Math.max(mx, n);
            mn = Math.min(mn, n);
        }
        return Math.max(0, mx - mn - 2 * k);
    }
}
