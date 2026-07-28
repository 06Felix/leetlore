class Solution {
    public int maxPower(String s) {
        int ans = 1, ct = 1;
        for(int i = 1 ; i < s.length() ; i++){
            ct = s.charAt(i) == s.charAt(i - 1) ? ct + 1 : 1;
            ans = Math.max(ct, ans);
        }
        return ans;
    }
}
