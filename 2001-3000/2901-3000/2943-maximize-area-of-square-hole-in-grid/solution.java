class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        int side = Math.min(find(hBars), find(vBars));
        return side * side;
    }
    private int find(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = 2;
        int cur = 2;
        for (int i = 1; i < n; ++i) {
            cur = arr[i] == arr[i - 1] + 1 ? cur + 1 : 2;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
