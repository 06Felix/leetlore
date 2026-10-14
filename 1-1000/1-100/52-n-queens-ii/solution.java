class Solution {
    private int n;
    private int col = 0;
    private int d1 = 0;
    private int d2 = 0;
    private int ans = 0;

    public int totalNQueens(int n) {
        this.n = n;
        find(0);
        return ans;
    }

    private boolean isValid(int i, int j) {
        return ((1 << j) & col) == 0 &&
            ((1 << (i + j)) & d1) == 0 &&
            ((1 << (i - j + n)) & d2) == 0;
    }

    private void flip(int i, int j) {
        col ^= (1 << j);
        d1 ^= (1 << (i + j));
        d2 ^= (1 << (i - j + n));
    }

    private void find(int row) {
        if (row == n) {
            ans++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(row, col)) {
                flip(row, col);
                find(row + 1);
                flip(row, col);
            }
        }
    }
}
