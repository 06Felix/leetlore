class Solution {
    public List<String> maxNumOfSubstrings(String s) {
        int n = s.length();
        char[] str = s.toCharArray();
        int[] first = new int[26];
        int[] last = new int[26];

        Arrays.fill(first, n);
        Arrays.fill(last, -1);

        for (int i = 0; i < n; ++i) {
            int idx = str[i] - 'a';
            first[idx] = Math.min(first[idx], i);
            last[idx] = i;
        }

        List<int[]> segs = new ArrayList<>();

        for (int i = 0; i < 26; ++i) {
            if (last[i] == -1)
                continue;

            int left = first[i];
            int right = last[i];
            boolean ok = true;

            for (int j = left; j <= right && ok; ++j) {
                int idx = str[j] - 'a';

                if (first[idx] < left)
                    ok = false;
                else
                    right = Math.max(right, last[idx]);
            }

            if (ok)
                segs.add(new int[] {left, right});
        }

        segs.sort((x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);

        List<String> ans = new ArrayList<>();
        int end = -1;

        for (int[] seg : segs) {
            if (seg[0] > end) {
                ans.add(s.substring(seg[0], seg[1] + 1));
                end = seg[1];
            }
        }

        return ans;
    }
}
