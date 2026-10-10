class SegmentTree {
    private int[] tree;
    private int[] lazy;
    private int n;

    public SegmentTree(int[] nums) {
        n = nums.length;
        tree = new int[4 * n];
        lazy = new int[4 * n];
        build(nums, 0, 0, n - 1);
    }
    private void build(int[] nums, int node, int start, int end) {
        if (start == end) {
            tree[node] = nums[start];
        } else {
            int mid = (start + end) / 2;
            build(nums, 2 * node + 1, start, mid);
            build(nums, 2 * node + 2, mid + 1, end);
            tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
        }
    }
    private void propagate(int node, int start, int end) {
        if (lazy[node] != 0) {
            tree[node] -= lazy[node];
            if (start != end) {
                lazy[2 * node + 1] += lazy[node];
                lazy[2 * node + 2] += lazy[node];
            }
            lazy[node] = 0;
        }
    }
    public int query(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }

    private int query(int node, int start, int end, int l, int r) {
        propagate(node, start, end);
        if (r < start || end < l)
            return Integer.MIN_VALUE;
        if (l <= start && end <= r)
            return tree[node];
        int mid = (start + end) / 2;
        int left = query(2 * node + 1, start, mid, l, r);
        int right = query(2 * node + 2, mid + 1, end, l, r);
        return Math.max(left, right);
    }

    public void update(int l, int r, int value) {
        update(0, 0, n - 1, l, r, value);
    }

    private void update(int node, int start, int end, int l, int r, int value) {
        propagate(node, start, end);
        if (r < start || end < l)
            return;
        if (l <= start && end <= r) {
            lazy[node] += value;
            propagate(node, start, end);
            return;
        }
        int mid = (start + end) / 2;
        update(2 * node + 1, start, mid, l, r, value);
        update(2 * node + 2, mid + 1, end, l, r, value);
        tree[node] = Math.max(tree[2 * node + 1], tree[2 * node + 2]);
    }
    public boolean isZeroArray() {
        return tree[0] <= 0;
    }
}

class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        SegmentTree st = new SegmentTree(nums);
        if (st.isZeroArray())
            return 0;
        for (int q = 0; q < queries.length; q++) {
            int li = queries[q][0];
            int ri = queries[q][1];
            int vali = queries[q][2];
            st.update(li, ri, vali);
            if (st.isZeroArray())
                return q + 1;
        }
        return -1;
    }
}
