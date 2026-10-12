class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int len = n * m;
        int[] ans = new int[len];
        int row = 0, col = 0;
        for (int i = 0; i < len; i++) {
            ans[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == m - 1)
                    row++;
                else if (row == 0)
                    col++;
                else {
                    row--;
                    col++;
                }
            } else {
                if (row == n - 1)
                    col++;
                else if (col == 0)
                    row++;
                else {
                    row++;
                    col--;
                }
            }
        }
        return ans;
    }
}
