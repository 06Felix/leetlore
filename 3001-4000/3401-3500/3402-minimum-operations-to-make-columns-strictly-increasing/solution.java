class Solution {
    public int minimumOperations(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int j = 0 ; j < m ; j++){
            int cur = grid[0][j] + 1;
            for(int i = 1 ; i < n ; i++){
                if(grid[i][j] < cur){
                    ans += cur - grid[i][j];
                    grid[i][j] = cur;
                }
                cur = grid[i][j] + 1;
            }
        }
        return ans;
    }
}
