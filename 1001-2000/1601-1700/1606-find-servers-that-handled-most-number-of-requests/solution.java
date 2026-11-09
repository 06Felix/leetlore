class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {
        TreeSet<Integer> free = new TreeSet<>();
        PriorityQueue<long[]> busy = new PriorityQueue<>((first, second) ->
            Long.compare(first[0], second[0])
        );
        int[] cnt = new int[k];

        for (int i = 0; i < k; ++i)
            free.add(i);

        for (int i = 0; i < arrival.length; ++i) {
            while (!busy.isEmpty() && busy.peek()[0] <= arrival[i])
                free.add((int) busy.poll()[1]);

            if (free.isEmpty())
                continue;

            int want = i % k;
            Integer id = free.ceiling(want);

            if (id == null)
                id = free.first();

            free.remove(id);
            ++cnt[id];
            busy.offer(new long[] {(long) arrival[i] + load[i], id});
        }

        int best = 0;

        for (int num : cnt)
            best = Math.max(best, num);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < k; ++i)
            if (cnt[i] == best)
                ans.add(i);

        return ans;
    }
}
