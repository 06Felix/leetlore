class Solution {
    private static final int INF = 1_000_000_000;
    private static final int[] F2 = {0, 0, 1, 0, 2, 0, 1, 0, 3, 0};
    private static final int[] F3 = {0, 0, 0, 1, 0, 0, 1, 0, 0, 2};
    private static final int[] F5 = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
    private static final int[] F7 = {0, 0, 0, 0, 0, 0, 0, 1, 0, 0};

    private int lim2;
    private int lim3;
    private int lim5;
    private int lim7;
    private int[] memo;

    public String smallestNumber(String num, long t) {
        lim2 = 0;
        lim3 = 0;
        lim5 = 0;
        lim7 = 0;

        while (t % 2 == 0) {
            ++lim2;
            t /= 2;
        }

        while (t % 3 == 0) {
            ++lim3;
            t /= 3;
        }

        while (t % 5 == 0) {
            ++lim5;
            t /= 5;
        }

        while (t % 7 == 0) {
            ++lim7;
            t /= 7;
        }

        if (t > 1)
            return "-1";

        memo = new int[(lim2 + 1) * (lim3 + 1) * (lim5 + 1) * (lim7 + 1)];
        Arrays.fill(memo, -1);

        int n = num.length();
        int[] p2 = new int[n + 1];
        int[] p3 = new int[n + 1];
        int[] p5 = new int[n + 1];
        int[] p7 = new int[n + 1];
        int first = n;

        for (int i = 0; i < n; ++i) {
            int dig = num.charAt(i) - '0';

            if (dig == 0 && first == n)
                first = i;

            p2[i + 1] = Math.min(lim2, p2[i] + F2[dig]);
            p3[i + 1] = Math.min(lim3, p3[i] + F3[dig]);
            p5[i + 1] = Math.min(lim5, p5[i] + F5[dig]);
            p7[i + 1] = Math.min(lim7, p7[i] + F7[dig]);
        }

        if (first == n && p2[n] == lim2 && p3[n] == lim3 && p5[n] == lim5 && p7[n] == lim7)
            return num;

        for (int i = n - 1; i >= 0; --i) {
            if (i > first)
                continue;

            int cur = num.charAt(i) - '0';

            for (int dig = Math.max(1, cur + 1); dig <= 9; ++dig) {
                int r2 = Math.max(0, lim2 - p2[i] - F2[dig]);
                int r3 = Math.max(0, lim3 - p3[i] - F3[dig]);
                int r5 = Math.max(0, lim5 - p5[i] - F5[dig]);
                int r7 = Math.max(0, lim7 - p7[i] - F7[dig]);
                int left = n - i - 1;

                if (calc(r2, r3, r5, r7) <= left) {
                    StringBuilder ans = new StringBuilder();
                    ans.append(num, 0, i);
                    ans.append((char) ('0' + dig));
                    ans.append(build(r2, r3, r5, r7, left));

                    return ans.toString();
                }
            }
        }

        int need = calc(lim2, lim3, lim5, lim7);
        int len = Math.max(n + 1, need);

        return build(lim2, lim3, lim5, lim7, len);
    }

    private int calc(int a, int b, int c, int d) {
        if (a == 0 && b == 0 && c == 0 && d == 0)
            return 0;

        int id = id(a, b, c, d);

        if (memo[id] != -1)
            return memo[id];

        int best = INF;

        for (int dig = 2; dig <= 9; ++dig) {
            int na = Math.max(0, a - F2[dig]);
            int nb = Math.max(0, b - F3[dig]);
            int nc = Math.max(0, c - F5[dig]);
            int nd = Math.max(0, d - F7[dig]);

            if (na == a && nb == b && nc == c && nd == d)
                continue;

            best = Math.min(best, 1 + calc(na, nb, nc, nd));
        }

        return memo[id] = best;
    }

    private String build(int a, int b, int c, int d, int len) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < len; ++i) {
            for (int dig = 1; dig <= 9; ++dig) {
                int na = Math.max(0, a - F2[dig]);
                int nb = Math.max(0, b - F3[dig]);
                int nc = Math.max(0, c - F5[dig]);
                int nd = Math.max(0, d - F7[dig]);

                if (calc(na, nb, nc, nd) <= len - i - 1) {
                    ans.append((char) ('0' + dig));
                    a = na;
                    b = nb;
                    c = nc;
                    d = nd;
                    break;
                }
            }
        }

        return ans.toString();
    }

    private int id(int a, int b, int c, int d) {
        return (((a * (lim3 + 1) + b) * (lim5 + 1) + c) * (lim7 + 1) + d);
    }
}
