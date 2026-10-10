class Solution {
    public int[][] dirs = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};
    private boolean dfs(int[][] mat, int i, int j, int n, int cur){
        if(cur == n * n)
            return true;
        if(i < 0 || j < 0 || i >= n || j >= n || mat[i][j] != cur)
            return false;
        for(int[] dir : dirs){
            if(dfs(mat, i + dir[0], j + dir[1], n, cur + 1))
                return true;
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        return dfs(grid, 0, 0, n, 0);
    }
}
