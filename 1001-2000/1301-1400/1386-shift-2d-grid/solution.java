class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] ans = new int[n][m];
        k %= m * n;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                int c = (i * m + j + k) % (m * n);
                ans[c / m][c % m] = grid[i][j];
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int[] r : ans){
            List<Integer> l = new ArrayList<>();
            for(int x : r)
                l.add(x);
            res.add(l);
        }
        return res;
    }
}
