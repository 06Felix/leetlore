class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values,
            List<List<String>> queries) {
        int n = queries.size();
        double[] ans = new double[n];
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); ++i) {
            String A = equations.get(i).get(0);
            String B = equations.get(i).get(1);
            graph.putIfAbsent(A, new HashMap<>());
            graph.putIfAbsent(B, new HashMap<>());
            graph.get(A).put(B, values[i]);
            graph.get(B).put(A, 1.0 / values[i]);
        }

        for (int i = 0; i < n; ++i) {
            String A = queries.get(i).get(0);
            String C = queries.get(i).get(1);
            if (!graph.containsKey(A) || !graph.containsKey(C))
                ans[i] = -1.0;
            else
                ans[i] = divide(graph, A, C, new HashSet<>());
        }
        return ans;
    }

    private double divide(Map<String, Map<String, Double>> graph, String A, String C,
            Set<String> seen) {
        if (A.equals(C))
            return 1.0;
        seen.add(A);
        for (String B : graph.get(A).keySet()) {
            if (seen.contains(B))
                continue;
            double res = divide(graph, B, C, seen);
            if (res > 0)
                return graph.get(A).get(B) * res;
        }
        return -1.0;
    }
}
