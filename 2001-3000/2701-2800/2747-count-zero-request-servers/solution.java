class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        int size = queries.length;
        int[] ans = new int[size];
        int[][] order = new int[size][2];
        int[] freq = new int[n + 1];

        for (int i = 0; i < size; ++i) {
            order[i][0] = queries[i];
            order[i][1] = i;
        }

        Arrays.sort(logs, (first, second) ->
            Integer.compare(first[1], second[1])
        );
        Arrays.sort(order, (first, second) ->
            Integer.compare(first[0], second[0])
        );

        int left = 0;
        int right = 0;
        int active = 0;

        for (int[] query : order) {
            int time = query[0];

            while (right < logs.length && logs[right][1] <= time) {
                int id = logs[right][0];

                if (freq[id] == 0)
                    ++active;

                ++freq[id];
                ++right;
            }

            while (left < right && logs[left][1] < time - x) {
                int id = logs[left][0];
                --freq[id];

                if (freq[id] == 0)
                    --active;

                ++left;
            }

            ans[query[1]] = n - active;
        }

        return ans;
    }
}
