class Solution {
    public int minOperations(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        boolean sorted = true;
        char mn = 'z';
        char mx = 'a';

        for (int i = 0; i < n; ++i) {
            char ch = str[i];
            mn = (char) Math.min(mn, ch);
            mx = (char) Math.max(mx, ch);

            if (i > 0 && str[i - 1] > ch)
                sorted = false;
        }

        if (sorted)
            return 0;

        if (n == 2)
            return -1;

        if (str[0] == mn || str[n - 1] == mx)
            return 1;

        for (int i = 1; i + 1 < n; ++i) {
            char ch = str[i];

            if (ch == mn || ch == mx)
                return 2;
        }

        return 3;
    }
}
