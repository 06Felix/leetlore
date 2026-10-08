class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long ans = Long.MAX_VALUE;
        long s0 = 0;
        for(int x : grid[0])
            s0 += x;
        long s1 = 0;
        for (int i = 0; i < n; i++) {
            s0 -= grid[0][i];
            ans = Math.min(ans, Math.max(s0, s1));
            s1 += grid[1][i];
        }
        return ans;
    }
}
