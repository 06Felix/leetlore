class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] r = new int[m * n + 1];
        int[] c = new int[m * n + 1];
        int[] ctR = new int[n];
        int[] ctC = new int[m];
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                r[mat[i][j]] = i;
                c[mat[i][j]] = j;
            }
        for(int i = 0 ; i < m * n ; i++)
            if(++ctR[r[arr[i]]] == m || ++ctC[c[arr[i]]] == n)
                return i;
        return -1;
    }
}
