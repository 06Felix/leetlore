class Solution {
    int[][] mask = new int[6][6];
    int[][] cache = new int[7][];
    static final int[] POW6 = {1, 6, 36, 216, 1296, 7776, 46656};

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (int i = 2; i <= 6; i++)
            cache[i] = new int[POW6[i]];
        for (String s : allowed) {
            int a = s.charAt(0) - 'A';
            int b = s.charAt(1) - 'A';
            int c = s.charAt(2) - 'A';
            mask[a][b] |= 1 << c;
        }
        int n = bottom.length();
        int[] row = new int[n];
        for (int i = 0; i < n; i++)
            row[i] = bottom.charAt(i) - 'A';
        return dfs(row, n);
    }

    boolean dfs(int[] row, int len) {
        if (len == 1)
            return true;
        int key = encode(row, len);
        int memo = cache[len][key];
        if (memo != 0)
            return memo == 1;
        int[] next = new int[len - 1];
        boolean res = build(row, next, 0, len);
        cache[len][key] = res ? 1 : 2;
        return res;
    }

    boolean build(int[] row, int[] next, int i, int len) {
        if (i == len - 1)
            return dfs(next, len - 1);
        int m = mask[row[i]][row[i + 1]];
        if (m == 0)
            return false;
        while (m != 0) {
            int bit = m & -m;
            next[i] = Integer.numberOfTrailingZeros(bit);
            if (build(row, next, i + 1, len))
                return true;
            m -= bit;
        }
        return false;
    }

    int encode(int[] arr, int len) {
        int enc = 0;
        for (int i = 0; i < len; i++)
            enc = enc * 6 + arr[i];
        return enc;
    }
}
