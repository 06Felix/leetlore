class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            int c = 0;
            for(int j = n - 1 ; j >= 0 ; j--)
                ans[i][c++] = image[i][j] == 0 ? 1 : 0;
        }
        return ans;
    }
}
