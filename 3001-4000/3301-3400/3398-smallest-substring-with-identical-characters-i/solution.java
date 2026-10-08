class Solution {
    public int minLength(String s, int numOps) {
        int l = 1;
        int r = s.length();
        while (l < r) {
            int m = (l + r) / 2;
            if (find(s, m) <= numOps)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    private int find(String s, int k) {
        int ans = 0;
        if (k == 1) {
            for (int i = 0; i < s.length(); ++i)
                if (s.charAt(i) - '0' == i % 2)
                    ++ans;
            return Math.min(ans, s.length() - ans);
        }
        int cur = 1;
        for (int i = 1; i < s.length(); ++i)
            if (s.charAt(i) == s.charAt(i - 1))
                cur++;
            else {
                ans += cur / (k + 1);
                cur = 1;
            }
        return ans + cur / (k + 1);
    }
}
