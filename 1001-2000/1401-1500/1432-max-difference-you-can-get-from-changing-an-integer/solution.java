class Solution {
    public int maxDiff(int num) {
        char[] s = String.valueOf(num).toCharArray();
        int n = s.length;
        int find9 = find(s, '9', '9', n);
        int find01 = find(s, '0', '1', n);
        String a = new String(s).replace(s[(find9)], '9');
        String b = new String(s).replace(s[find01], find01 == 0 ? '1' : '0');
        return Integer.parseInt(a) - Integer.parseInt(b);
    }
    private int find(char[] s, char a, char b, int n) {
        for (int i = 0; i < n; ++i)
            if (s[i] != a && s[i] != b)
                return i;
        return 0;
    }
}
