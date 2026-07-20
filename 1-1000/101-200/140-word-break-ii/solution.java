class Solution {
    Set<String> hs;
    List<String> ans;
    public List<String> wordBreak(String s, List<String> wordDict) {
        hs = new HashSet<>(wordDict);
        ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>());
        return ans;
    }

    public void dfs(String s, int idx, List<String> path){
        if(idx == s.length()){
            ans.add(String.join(" ", path));
            return;
        }
        for(int i = idx; i < s.length(); i++){
            String str = s.substring(idx, i + 1);
            if(hs.contains(str)){
                path.add(str);
                dfs(s, i + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }
}
