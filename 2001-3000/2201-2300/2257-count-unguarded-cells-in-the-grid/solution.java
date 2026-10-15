class Solution {
    private int count = 0;
    private void fill(int[][] arr, int i, int j, int n, int m){
        arr[i][j] = 2;
        int x = i, y = j + 1;
        while(y < m && arr[x][y] <= 1){
            if(arr[x][y] == 0)
                count++;
            arr[x][y] = 1;
            y++;
        }
        y = j - 1;
        while(y >= 0 && arr[x][y] <= 1){
            if(arr[x][y] == 0)
                count++;
            arr[x][y] = 1;
            y--;
        }
        x = i + 1; y = j;
        while(x < n && arr[x][y] <= 1){
            if(arr[x][y] == 0)
                count++;
            arr[x][y] = 1;
            x++;
        }
        x = i - 1;
        while(x >= 0 && arr[x][y] <= 1){
            if(arr[x][y] == 0)
                count++;
            arr[x][y] = 1;
            x--;
        }
    }
    public int countUnguarded(int n, int m, int[][] guards, int[][] walls) {
        int[][] arr = new int[n][m];
        for(int[] w : walls)
            arr[w[0]][w[1]] = 3;
        for(int[] g : guards)
            arr[g[0]][g[1]] = 2;
        for(int[] g : guards)
            fill(arr, g[0], g[1], n, m);
        return m * n - guards.length - walls.length - count;
    }
}
