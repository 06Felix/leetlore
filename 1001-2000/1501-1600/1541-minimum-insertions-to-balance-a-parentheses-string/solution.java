class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int need = 0;
        int n = s.length();

        for (int i = 0; i < n; ++i) {
            if (s.charAt(i) == '(') {
                need += 2;

                if ((need & 1) == 1) {
                    ++ans;
                    --need;
                }
            } else {
                --need;

                if (need < 0) {
                    ++ans;
                    need = 1;
                }
            }
        }

        return ans + need;
    }
}
