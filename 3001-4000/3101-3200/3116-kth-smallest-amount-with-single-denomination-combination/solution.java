class Solution {
    public long findKthSmallest(int[] coins, int k) {
        Arrays.sort(coins);

        int[] vals = new int[coins.length];
        int size = 0;

        for (int coin : coins) {
            boolean skip = false;

            for (int i = 0; i < size; ++i) {
                if (coin % vals[i] == 0) {
                    skip = true;
                    break;
                }
            }

            if (!skip)
                vals[size++] = coin;
        }

        int total = (1 << size) - 1;
        long[] lcms = new long[total];
        int[] sign = new int[total];

        for (int mask = 1; mask <= total; ++mask) {
            long lcm = 1;
            int bits = 0;

            for (int i = 0; i < size; ++i) {
                if (((mask >> i) & 1) == 1) {
                    lcm = lcm(lcm, vals[i]);
                    ++bits;
                }
            }

            lcms[mask - 1] = lcm;
            sign[mask - 1] = (bits & 1) == 1 ? 1 : -1;
        }

        long left = 1;
        long right = (long) vals[0] * k;

        while (left < right) {
            long mid = left + ((right - left) >>> 1);

            if (count(mid, lcms, sign) >= k)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private long count(long num, long[] lcms, int[] sign) {
        long cnt = 0;

        for (int i = 0; i < lcms.length; ++i)
            cnt += sign[i] * (num / lcms[i]);

        return cnt;
    }

    private long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    private long gcd(long a, long b) {
        while (b != 0) {
            long rem = a % b;
            a = b;
            b = rem;
        }

        return a;
    }
}
