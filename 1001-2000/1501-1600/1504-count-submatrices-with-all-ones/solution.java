class Solution {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] arr = new int[m];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j] = (mat[i][j] == 1) ? arr[j] + 1 : 0;
                int mn = arr[j];
                for (int k = j; k >= 0 && arr[k] > 0; k--) {
                    mn = Math.min(mn, arr[k]);
                    ans += mn;
                }
            }
        }
        return ans;
    }
}
