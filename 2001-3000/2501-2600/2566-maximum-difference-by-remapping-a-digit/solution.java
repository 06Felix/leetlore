class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        char to9 = s.charAt(firstNotNineIndex(s));
        char to0 = s.charAt(0);
        return getMax(new StringBuilder(s), to9, n) - getMin(new StringBuilder(s), to0, n);
    }

    private int firstNotNineIndex(String s) {
        for (int i = 0; i < s.length(); ++i)
            if (s.charAt(i) != '9')
                return i;
        return 0;
    }

    private int getMax(StringBuilder sb, char to9, int n) {
        for (int i = 0; i < n; ++i)
            if (sb.charAt(i) == to9)
                sb.setCharAt(i, '9');
        return Integer.parseInt(sb.toString());
    }
    private int getMin(StringBuilder sb, char to0, int n) {
        for (int i = 0; i < n; ++i)
            if (sb.charAt(i) == to0)
                sb.setCharAt(i, '0');
        return Integer.parseInt(sb.toString());
    }
}
