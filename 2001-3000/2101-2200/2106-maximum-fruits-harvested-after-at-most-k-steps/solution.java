class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int l = 0;
        int sum = 0;
        int ans = 0;
        int n = fruits.length;
        while (l < n && fruits[l][0] < startPos - k)
            l++;
        for (int r = l; r < n && fruits[r][0] <= startPos + k; ++r) {
            sum += fruits[r][1];
            while (Math.min(startPos - 2 * fruits[l][0] + fruits[r][0], 2 * fruits[r][0] - fruits[l][0] - startPos) > k)
                sum -= fruits[l++][1];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
