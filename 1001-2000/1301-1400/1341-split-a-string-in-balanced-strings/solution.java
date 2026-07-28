class Solution {
    public int balancedStringSplit(String s) {
        int ans = 0;
        int ct = 0;
        for (char c : s.toCharArray()) {
            ct += c == 'L' ? 1 : -1;
            if (ct == 0)
                ++ans;
        }
        return ans;
    }
}
