class Solution {
    public int[][] validArrangement(int[][] pairs) {
        List<int[]> ans = new ArrayList<>();
        Map<Integer, Deque<Integer>> adj = new HashMap<>();
        Map<Integer, Integer> oD = new HashMap<>();
        Map<Integer, Integer> iD = new HashMap<>();
        for (int[] pair : pairs) {
            int start = pair[0];
            int end = pair[1];
            adj.putIfAbsent(start, new ArrayDeque<>());
            adj.get(start).push(end);
            oD.merge(start, 1, Integer::sum);
            iD.merge(end, 1, Integer::sum);
        }

        int startNode = getStartNode(adj, oD, iD, pairs);
        find(adj, startNode, ans);
        Collections.reverse(ans);
        return ans.stream().toArray(int[][] ::new);
    }

    private int getStartNode(Map<Integer, Deque<Integer>> adj, Map<Integer, Integer> oD,
                            Map<Integer, Integer> iD, int[][] pairs) {
        for (int u : adj.keySet())
            if (oD.getOrDefault(u, 0) - iD.getOrDefault(u, 0) == 1)
                return u;
        return pairs[0][0];
    }

    private void find(Map<Integer, Deque<Integer>> adj, int u, List<int[]> ans) {
        Deque<Integer> st = adj.get(u);
        while (st != null && !st.isEmpty()) {
            int v = st.pop();
            find(adj, v, ans);
            ans.add(new int[] {u, v});
        }
    }
}
