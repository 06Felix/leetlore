class Solution {
    private int ans = 0;
    public int maxUniqueSplit(String s) {
        dfs(0, s, new HashSet<>());
        return ans;
    }
    private void dfs(int st, String s, Set<String> set){
        if(st == s.length()){
            ans = Math.max(ans, set.size());
            return;
        }
        for(int i = st + 1 ; i <= s.length() ; i++){
            String nxt = s.substring(st, i);
            if(set.contains(nxt))
                continue;
            set.add(nxt);
            dfs(i, s, set);
            set.remove(nxt);
        }
    }
}
