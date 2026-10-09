class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] ans = new int[2 * n - 1];
        boolean[] vis = new boolean[n + 1];
        dfs(ans, 0, n, 2 * n - 1, vis);
        return ans;
    }
    private boolean dfs(int[] ans, int id, int mx, int n, boolean[] vis){
        if(id == n)
            return true;
        if(ans[id] != 0)
            return dfs(ans, id + 1, mx, n, vis);
        for(int num = mx ; num >= 1 ; num--){
            if(vis[num])
                continue;
            if(num == 1){
                vis[1] = true;
                ans[id] = 1;
                if(dfs(ans, id + 1, mx, n, vis))
                    return true;
                ans[id] = 0;
                vis[1] = false;
            }
            else{
                if(id + num >= n || ans[id + num] > 0)
                    continue;
                vis[num] = true;
                ans[id] = num;
                ans[id + num] = num;
                if(dfs(ans, id + 1, mx, n, vis))
                    return true;
                vis[num] = false;
                ans[id] = 0;
                ans[id + num] = 0;
            }
        }
        return false;
    }
}
