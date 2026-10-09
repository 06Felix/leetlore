class Solution {
    public int findCircleNum(int[][] mat) {
        int n = mat.length;
        boolean[] vis = new boolean[n];
        int ans = 0;
        for(int i = 0 ; i < n ; i++)
            if(!vis[i]){
                ans++;
                dfs(mat, vis, i, n);
            }
        return ans;
    }
    private void dfs(int[][] mat, boolean[] vis, int i, int n){
        vis[i] = true;
        for(int j = 0 ; j < n ; j++)
            if(mat[i][j] == 1 && !vis[j])
                dfs(mat, vis, j, n);
    }
}
