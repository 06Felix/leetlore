class Solution {
    public int diagonalSum(int[][] mat) {
        int ans = 0;
        int n = mat.length;
        int i = 0, j = 0;
        while(i < n)
            ans += mat[i++][j++];
        i = 0;
        j = n - 1;
        while(i < n)
            ans += mat[i++][j--];
        if((n & 1) == 1)
            ans -= mat[n / 2][n / 2];
        return ans;
    }
}
