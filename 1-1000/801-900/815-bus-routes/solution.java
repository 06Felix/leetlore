class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target)
            return 0;

        Map<Integer, List<Integer>> adj = new HashMap<>();
        Set<Integer> usedBuses = new HashSet<>();

        for (int i = 0; i < routes.length; ++i)
            for (int route : routes[i]) {
                adj.putIfAbsent(route, new ArrayList<>());
                adj.get(route).add(i);
            }

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(source);

        int ans = 0;
        while (!q.isEmpty()) {
            ++ans;
            for (int sz = q.size(); sz > 0; --sz) {
                int cur = q.poll();
                for (int bus : adj.getOrDefault(cur, new ArrayList<>()))
                    if (usedBuses.add(bus))
                        for (int nxt : routes[bus]) {
                            if (nxt == target)
                                return ans;
                            q.offer(nxt);
                        }
            }
        }
        return -1;
    }
}
