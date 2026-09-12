class Solution {
    public int[] maximumWeight(List<List<Integer>> intervals) {
        int n = intervals.size();
        int[][] arr = new int[n][4];

        for (int i = 0; i < n; ++i) {
            List<Integer> cur = intervals.get(i);

            arr[i][0] = cur.get(0);
            arr[i][1] = cur.get(1);
            arr[i][2] = cur.get(2);
            arr[i][3] = i;
        }

        Arrays.sort(arr, (x, y) -> x[0] == y[0] ? Integer.compare(x[1], y[1]) : Integer.compare(x[0], y[0]));

        int[] start = new int[n];

        for (int i = 0; i < n; ++i)
            start[i] = arr[i][0];

        int[] next = new int[n];

        for (int i = 0; i < n; ++i)
            next[i] = upper(start, arr[i][1]);

        State[][] dp = new State[n + 1][5];

        for (int k = 0; k <= 4; ++k)
            dp[n][k] = new State(0, new int[0]);

        for (int i = n - 1; i >= 0; --i) {
            dp[i][0] = new State(0, new int[0]);

            for (int k = 1; k <= 4; ++k) {
                State skip = dp[i + 1][k];
                State rest = dp[next[i]][k - 1];
                State take = new State(rest.sum + arr[i][2], add(rest.idx, arr[i][3]));

                dp[i][k] = better(skip, take);
            }
        }

        return dp[0][4].idx;
    }

    private int upper(int[] start, int val) {
        int left = 0;
        int right = start.length;

        while (left < right) {
            int mid = (left + right) >>> 1;

            if (start[mid] > val)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }

    private int[] add(int[] arr, int val) {
        int[] ans = new int[arr.length + 1];
        int i = 0;
        int j = 0;

        while (i < arr.length && arr[i] < val)
            ans[j++] = arr[i++];

        ans[j++] = val;

        while (i < arr.length)
            ans[j++] = arr[i++];

        return ans;
    }

    private State better(State first, State second) {
        if (first.sum != second.sum)
            return first.sum > second.sum ? first : second;

        return less(first.idx, second.idx) ? first : second;
    }

    private boolean less(int[] first, int[] second) {
        int n = Math.min(first.length, second.length);

        for (int i = 0; i < n; ++i) {
            if (first[i] != second[i])
                return first[i] < second[i];
        }

        return first.length < second.length;
    }

    private class State {
        long sum;
        int[] idx;

        State(long sum, int[] idx) {
            this.sum = sum;
            this.idx = idx;
        }
    }
}
