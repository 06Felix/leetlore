class Solution {
    public long countGoodIntegers(int n, int k) {
        int hl = (n + 1) / 2;
        int mnh = (int) Math.pow(10, hl - 1);
        int mxh = (int) Math.pow(10, hl);
        long ans = 0;
        Set<String> vis = new HashSet<>();
        for (int i = mnh; i < mxh; ++i) {
            String fh = String.valueOf(i);
            String sh = new StringBuilder(fh).reverse().toString();
            String pal = fh + sh.substring(n % 2);
            if (Long.parseLong(pal) % k != 0)
                continue;
            char[] dig = pal.toCharArray();
            Arrays.sort(dig);
            String digStr = new String(dig);
            if (vis.contains(digStr))
                continue;
            vis.add(digStr);
            int[] ct = new int[10];
            for (char c : pal.toCharArray())
                ++ct[c - '0'];
            int d1 = n - ct[0];
            long perm = d1 * factorial(n - 1);
            for (int c : ct)
                if (c > 1)
                perm /= factorial(c);
            ans += perm;
        }
        return ans;
    }
    private long factorial(int n) {
        long ans = 1;
        for (int i = 2; i <= n; ++i)
            ans *= i;
        return ans;
    }
}
