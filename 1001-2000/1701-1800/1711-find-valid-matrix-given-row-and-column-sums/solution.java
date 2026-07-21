class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int n = rowSum.length;
        int m = colSum.length;
        int[][] ans = new int[n][m];
        int i = 0, j = 0;
        while(i < n && j < m){
            int red = Math.min(rowSum[i], colSum[j]);
            ans[i][j] = red;
            rowSum[i] -= red;
            colSum[j] -= red;
            if(rowSum[i] == 0)
                i++;
            else
                j++; 
        }
        return ans;
    }
}
