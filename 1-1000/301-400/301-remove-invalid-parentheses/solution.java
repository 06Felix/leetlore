class Solution {
    private boolean isV(String s){
        int op = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(')
                op++;
            else if(ch == ')')
                op--;
            if(op < 0)
                return false;
        }
        return true;
    }
    private int[] delC(String s){
        int l = 0, r = 0;
        for(char ch : s.toCharArray())
            if(ch == '(')
                l++;
            else if(ch == ')'){
                if(l == 0)
                    r++;
                else
                    l--;
            }
        return new int[]{l, r};
    }
    public void dfs(String s, int st, int l, int r, List<String> ans){
        if(l == 0 && r == 0 && isV(s)){
            ans.add(s);
            return;
        }
        for(int i = st ; i < s.length() ; i++){
            if(i > st && s.charAt(i) == s.charAt(i - 1))
                continue;
            if(l > 0 && s.charAt(i) == '(')
                dfs(s.substring(0, i) + s.substring(i + 1), i, l - 1, r, ans);
            else if(r > 0 && s.charAt(i) == ')')
                dfs(s.substring(0, i) + s.substring(i + 1), i, l , r - 1, ans);
        }
    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList<>();
        int[] lrc = delC(s);
        dfs(s, 0, lrc[0], lrc[1], ans);
        return ans;
    }
}
