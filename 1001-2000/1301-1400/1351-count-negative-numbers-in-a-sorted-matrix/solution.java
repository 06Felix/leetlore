class Solution {
    private int n;
    public int countNegatives(int[][] grid) {
        this.n = grid[0].length;
        int ans = 0;
        for (int[] arr : grid)
            ans += countNegatives(arr);
        return ans;
    }
    private int countNegatives(int[] arr) {
        int l = 0, r = n - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] < 0)
                r = m;
            else
                l = m + 1;
        }
        return arr[l] < 0 ? n - l : 0;
    }
}
