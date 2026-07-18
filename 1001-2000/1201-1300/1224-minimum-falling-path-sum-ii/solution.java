class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        for(int i = 1 ; i < n ; i++){
            int[] mins = findMins(grid[i - 1]);
            for(int j = 0 ; j < n ; j++)
                if(grid[i - 1][j] == mins[0])
                    grid[i][j] += mins[1];
                else
                    grid[i][j] += mins[0];
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0 ; i < n ; i++)
            ans = Math.min(ans, grid[n - 1][i]);
        return ans;
    }
    private int[] findMins(int[] arr){
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for(int n : arr){
            if(n < m1){
                m2 = m1;
                m1 = n;
            }
            else if(n < m2)
                m2 = n;
        }
        return new int[]{m1, m2};
    }
}
