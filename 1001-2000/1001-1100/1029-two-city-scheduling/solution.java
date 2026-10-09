class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        Arrays.sort(costs, (a, b) -> a[0] - a[1] + b[1] - b[0]);
        int l = 0, r = n - 1;
        int ans = 0;
        while(l < r)
            ans += costs[l++][0] + costs[r--][1];
        return ans;
        // (a, b) -> b - a;
        // (d1, d2) -> d1 - d2;
        // d1 = a[0] - a[1]
        // d2 = b[0] - b[1]
    }
}
