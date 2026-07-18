class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int ct = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                ct++;
                ans = Math.max(ct,ans);
            }
            else if(ch == ')')
                ct--;
        }
        return ans;
    }
}
