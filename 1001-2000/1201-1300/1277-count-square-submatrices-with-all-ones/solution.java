class Solution {
    public int countSquares(int[][] matrix) {
        for (int i = 1; i < matrix.length; ++i)
            for (int j = 1; j < matrix[0].length; ++j)
                if (matrix[i][j] == 1)
                    matrix[i][j] += Math.min(matrix[i - 1][j - 1], Math.min(matrix[i - 1][j], matrix[i][j - 1]));
        int ans = 0;
        for(int[] row : matrix)
            for(int x : row)
                ans += x;
        return ans;
    }
}
