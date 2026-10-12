class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        int n = folder.length;
        for(int i = 0 ; i < n ; ){
            String cur = folder[i];
            ans.add(cur);
            cur += "/";
            while(++i < n && folder[i].startsWith(cur))
                continue;
        }
        return ans;
    }
}
