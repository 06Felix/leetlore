class Solution {
    private int ans = -1;
    private boolean dfs(char[] id, int cur, int i, int prv, int n, boolean[] vis){
        if(i == n){
            ans = cur;
            return true;
        }
        if(id[i] == 'I'){
            for(int nxt = prv + 1 ; nxt <= 9; nxt++){
                if(vis[nxt])
                    continue;
                vis[nxt] = true;
                if(dfs(id, cur * 10 + nxt, i + 1, nxt, n, vis))
                    return true;
                vis[nxt] = false;
            }
            return false;
        }
        for(int nxt = prv - 1; nxt >= 1; nxt--) {
            if(vis[nxt])
                continue;
            vis[nxt] = true;
            if(dfs(id, cur * 10 + nxt, i + 1, nxt, n, vis))
                return true;
            vis[nxt] = false;
        }
        return false;
    }
    public String smallestNumber(String pattern) {
        char[] arr = pattern.toCharArray();
        int n = arr.length;
        boolean[] vis = new boolean[10];
        for(int st = 1; st <= 9; st++){
            vis[st] = true;
            if(dfs(arr, st, 0, st, n, vis))
                break;
            vis[st] = false;
        }
        return String.valueOf(ans);
    }
}
