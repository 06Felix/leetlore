class Solution {
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        boolean[] vis = new boolean[n];
        dfs(graph, vis, 0, n, new ArrayList<>());
        return ans;
    }

    private void dfs(int[][] arr, boolean[] vis, int i, int n, List<Integer> l) {
        l.add(i);
        vis[i] = true;
        if (i == n - 1)
            ans.add(new ArrayList<>(l));
        else {
            for (int j : arr[i])
                if (!vis[j])
                    dfs(arr, vis, j, n, l);
        }
        vis[i] = false;
        l.remove(l.size() - 1);
    }
}
