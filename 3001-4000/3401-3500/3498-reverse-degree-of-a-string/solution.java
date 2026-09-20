class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        int n = s.length();

        for (int i = 0; i < n; ++i)
            ans += (26 - (s.charAt(i) - 'a')) * (i + 1);

        return ans;
    }
}
