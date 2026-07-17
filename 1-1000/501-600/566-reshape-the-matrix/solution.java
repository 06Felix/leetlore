class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;
        int ans[][] = new int[r][c];
        int i = 0;
        for(int[] arr : mat)
            for(int x : arr){
                ans[i/c][i%c] = x;
                i++;
            }
        return ans;
    }
}
