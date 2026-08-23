class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sum = 0;
        int left = 0;
        int right = 0;

        for (int i = 0; i < n; ++i) {
            char ch = num.charAt(i);

            if (ch == '?') {
                if (i < n / 2)
                    ++left;
                else
                    ++right;
            } else {
                if (i < n / 2)
                    sum += ch - '0';
                else
                    sum -= ch - '0';
            }
        }

        if (((left + right) & 1) == 1)
            return true;

        return sum != (right - left) / 2 * 9;
    }
}
