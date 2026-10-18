class Solution {
    private static final long MOD = 1_000_000_007L;

    private long[] sum;
    private long[] sq;
    private long[] lazy;

    public int sumCounts(int[] nums) {
        int n = nums.length;
        sum = new long[n << 2];
        sq = new long[n << 2];
        lazy = new long[n << 2];

        Map<Integer, Integer> last = new HashMap<>();
        long ans = 0;

        for (int i = 0; i < n; ++i) {
            int prev = last.getOrDefault(nums[i], -1);
            update(1, 0, n - 1, prev + 1, i);
            ans = (ans + sq[1]) % MOD;
            last.put(nums[i], i);
        }

        return (int) ans;
    }

    private void update(int node, int left, int right, int start, int end) {
        if (start <= left && right <= end) {
            add(node, left, right, 1);
            return;
        }

        push(node, left, right);

        int mid = (left + right) >>> 1;

        if (start <= mid)
            update(node << 1, left, mid, start, end);

        if (end > mid)
            update(node << 1 | 1, mid + 1, right, start, end);

        sum[node] = (sum[node << 1] + sum[node << 1 | 1]) % MOD;
        sq[node] = (sq[node << 1] + sq[node << 1 | 1]) % MOD;
    }

    private void add(int node, int left, int right, long val) {
        long len = right - left + 1;

        sq[node] = (sq[node] + 2 * val * sum[node] + val * val * len) % MOD;
        sum[node] = (sum[node] + val * len) % MOD;
        lazy[node] += val;
    }

    private void push(int node, int left, int right) {
        if (lazy[node] == 0 || left == right)
            return;

        int mid = (left + right) >>> 1;
        add(node << 1, left, mid, lazy[node]);
        add(node << 1 | 1, mid + 1, right, lazy[node]);
        lazy[node] = 0;
    }
}
