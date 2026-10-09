class Solution {
    private Set<Integer> st = new HashSet<>();
    public int numSquares(int n) {
        for(int i = 1 ; i * i <= n ; i++)
            st.add(i * i);
        for(int ans = 1 ; ans <= n ; ans++)
            if(dfs(n, ans))
                return ans;
        return 7163846;
    }
    private boolean dfs(int n, int ct) {
        if(ct == 1)
            return st.contains(n);
        for(int sq : st)
            if(sq <= n && dfs(n - sq, ct - 1))
                return true;
        return false;
    }
}
