class Solution {
    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
        int n = s.length();
        char[] str = s.toCharArray();
        int total = 0;

        for (int i = 0; i < n; ++i)
            if (str[i] == '1')
                ++total;

        int[] start = new int[n];
        int[] end = new int[n];
        int[] len = new int[n];
        int[] block = new int[n];
        boolean[] one = new boolean[n];

        int size = 0;
        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && str[j] == str[i])
                ++j;

            start[size] = i;
            end[size] = j - 1;
            len[size] = j - i;
            one[size] = str[i] == '1';

            for (int k = i; k < j; ++k)
                block[k] = size;

            ++size;
            i = j;
        }

        int[] val = new int[size];

        for (i = 0; i + 2 < size; ++i)
            if (!one[i])
                val[i] = len[i] + len[i + 2];

        int log = 1;

        while ((1 << log) <= size)
            ++log;

        int[][] st = new int[log][size];

        for (i = 0; i < size; ++i)
            st[0][i] = val[i];

        for (int p = 1; p < log; ++p) {
            int step = 1 << (p - 1);

            for (i = 0; i + (1 << p) <= size; ++i)
                st[p][i] = Math.max(st[p - 1][i], st[p - 1][i + step]);
        }

        List<Integer> ans = new ArrayList<>();

        for (int[] query : queries) {
            int left = query[0];
            int right = query[1];
            int first = block[left];
            int last = block[right];
            int best = 0;

            if (last - first >= 2) {
                best = Math.max(best, getMax(st, first + 1, last - 3));

                if (!one[first]) {
                    int gain = end[first] - left + 1;

                    if (first + 2 == last)
                        gain += right - start[last] + 1;
                    else
                        gain += len[first + 2];

                    best = Math.max(best, gain);
                }

                if (!one[last]) {
                    int gain = right - start[last] + 1;

                    if (last - 2 == first)
                        gain += end[first] - left + 1;
                    else
                        gain += len[last - 2];

                    best = Math.max(best, gain);
                }
            }

            ans.add(total + best);
        }

        return ans;
    }

    private int getMax(int[][] st, int left, int right) {
        if (left > right)
            return 0;

        int len = right - left + 1;
        int p = 31 - Integer.numberOfLeadingZeros(len);

        return Math.max(st[p][left], st[p][right - (1 << p) + 1]);
    }
}
