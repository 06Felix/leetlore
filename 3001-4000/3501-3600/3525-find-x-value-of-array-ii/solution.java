class Solution {
    private int mod;
    private int[] prod;
    private int[][] cnt;
    private int qprod;
    private int[] qcnt;

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        int n = nums.length;
        mod = k;
        prod = new int[4 * n];
        cnt = new int[4 * n][k];

        build(nums, 1, 0, n - 1);

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; ++i) {
            int idx = queries[i][0];
            int val = queries[i][1] % k;
            int start = queries[i][2];
            int x = queries[i][3];

            update(1, 0, n - 1, idx, val);

            qprod = 1 % mod;
            qcnt = new int[mod];
            query(1, 0, n - 1, start, n - 1);
            ans[i] = qcnt[x];
        }

        return ans;
    }

    private void build(int[] nums, int node, int left, int right) {
        if (left == right) {
            prod[node] = nums[left] % mod;
            cnt[node][prod[node]] = 1;
            return;
        }

        int mid = (left + right) >>> 1;

        build(nums, node * 2, left, mid);
        build(nums, node * 2 + 1, mid + 1, right);
        pull(node);
    }

    private void update(int node, int left, int right, int idx, int val) {
        if (left == right) {
            for (int i = 0; i < mod; ++i)
                cnt[node][i] = 0;

            prod[node] = val;
            cnt[node][val] = 1;
            return;
        }

        int mid = (left + right) >>> 1;

        if (idx <= mid)
            update(node * 2, left, mid, idx, val);
        else
            update(node * 2 + 1, mid + 1, right, idx, val);

        pull(node);
    }

    private void query(int node, int left, int right, int ql, int qr) {
        if (qr < left || right < ql)
            return;

        if (ql <= left && right <= qr) {
            add(node);
            return;
        }

        int mid = (left + right) >>> 1;

        query(node * 2, left, mid, ql, qr);
        query(node * 2 + 1, mid + 1, right, ql, qr);
    }

    private void pull(int node) {
        int left = node * 2;
        int right = left + 1;

        prod[node] = prod[left] * prod[right] % mod;

        for (int i = 0; i < mod; ++i)
            cnt[node][i] = cnt[left][i];

        for (int i = 0; i < mod; ++i)
            cnt[node][prod[left] * i % mod] += cnt[right][i];
    }

    private void add(int node) {
        int[] next = new int[mod];

        for (int i = 0; i < mod; ++i)
            next[i] = qcnt[i];

        for (int i = 0; i < mod; ++i)
            next[qprod * i % mod] += cnt[node][i];

        qprod = qprod * prod[node] % mod;
        qcnt = next;
    }
}
