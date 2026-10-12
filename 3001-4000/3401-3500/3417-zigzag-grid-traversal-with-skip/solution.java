class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> ans = new ArrayList<>();
        int n = grid.length;
        int m = grid[0].length;
        int red = (m & 1);
        for(int i = 0 ; i < n ; i++){
            if((i & 1) == 0){
                for(int j = 0 ; j < m ; j += 2)
                    ans.add(grid[i][j]);
            }
            else{
                for(int j = m - red - 1 ; j >= 0 ; j -= 2)
                    ans.add(grid[i][j]);
            }
        }
        return ans;
    }
}
