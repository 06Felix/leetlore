class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        boolean[] vis = new boolean[n * n + 1];
        int sum = 0;
        int[] ans = new int[2];
        for(int[] y : grid)
            for(int x : y){
                if(!vis[x]){
                    sum += x;
                    vis[x] = true;
                }
                else
                    ans[0] = x;
            }
        int req = (n * n) * (n * n + 1) / 2;
        ans[1] = req - sum;
        return ans;
    }
}
