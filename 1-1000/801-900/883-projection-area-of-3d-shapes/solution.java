class Solution {
    public int projectionArea(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        for(int i = 0 ; i < n ; i++){
            int mR = 0, mC = 0;
            for(int j = 0 ; j < n ; j++){
                mR = Math.max(mR, grid[i][j]);
                mC = Math.max(mC, grid[j][i]);
                if(grid[i][j] > 0)
                    ans++;
            }
            ans += mR + mC;
        }
        return ans;
    }
}
