class Solution {
    private char[] left;
    private char[] right;
    private int[] pref;
    private int[] suff;
    private int[] best;
    private int[] len;
    private char[] str;

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        int k = queryCharacters.length();

        str = s.toCharArray();
        left = new char[4 * n];
        right = new char[4 * n];
        pref = new int[4 * n];
        suff = new int[4 * n];
        best = new int[4 * n];
        len = new int[4 * n];

        build(1, 0, n - 1);

        int[] ans = new int[k];

        for (int i = 0; i < k; ++i) {
            update(1, 0, n - 1, queryIndices[i], queryCharacters.charAt(i));
            ans[i] = best[1];
        }

        return ans;
    }

    private void build(int node, int lo, int hi) {
        if (lo == hi) {
            left[node] = str[lo];
            right[node] = str[lo];
            pref[node] = 1;
            suff[node] = 1;
            best[node] = 1;
            len[node] = 1;
            return;
        }

        int mid = (lo + hi) >>> 1;

        build(node << 1, lo, mid);
        build(node << 1 | 1, mid + 1, hi);
        pull(node);
    }

    private void update(int node, int lo, int hi, int idx, char ch) {
        if (lo == hi) {
            left[node] = ch;
            right[node] = ch;
            return;
        }

        int mid = (lo + hi) >>> 1;

        if (idx <= mid)
            update(node << 1, lo, mid, idx, ch);
        else
            update(node << 1 | 1, mid + 1, hi, idx, ch);

        pull(node);
    }

    private void pull(int node) {
        int lch = node << 1;
        int rch = node << 1 | 1;

        len[node] = len[lch] + len[rch];
        left[node] = left[lch];
        right[node] = right[rch];

        pref[node] = pref[lch];
        if (pref[lch] == len[lch] && right[lch] == left[rch])
            pref[node] += pref[rch];

        suff[node] = suff[rch];
        if (suff[rch] == len[rch] && right[lch] == left[rch])
            suff[node] += suff[lch];

        best[node] = Math.max(best[lch], best[rch]);
        if (right[lch] == left[rch])
            best[node] = Math.max(best[node], suff[lch] + pref[rch]);
    }
}
