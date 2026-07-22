class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int cnt = 0;

        for (int i = 0; i < n; ++i)
            if (s.charAt(i) == '1')
                ++cnt;

        int best = 0;
        int left = 0;
        int i = 0;

        while (i < n) {
            if (s.charAt(i) == '0') {
                left = 0;
                while (i < n && s.charAt(i) == '0') {
                    ++left;
                    ++i;
                }
            } else {
                while (i < n && s.charAt(i) == '1')
                    ++i;

                int right = 0;
                while (i < n && s.charAt(i) == '0') {
                    ++right;
                    ++i;
                }

                if (left > 0 && right > 0)
                    best = Math.max(best, left + right);

                left = right;
            }
        }

        return cnt + best;
    }
}
