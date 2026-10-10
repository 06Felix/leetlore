class Solution {
    public boolean checkValidCuts(int N, int[][] rectangles) {
        int n = rectangles.length;
        int[][] hor = new int[n][2];
        int[][] ver = new int[n][2];
        for (int i = 0; i < n; ++i) {
            hor[i][0] = rectangles[i][0];
            hor[i][1] = rectangles[i][2];
            ver[i][0] = rectangles[i][1];
            ver[i][1] = rectangles[i][3];
        }
        return Math.max(count(hor), count(ver)) > 2;
    }

    private int count(int[][] arr) {
        int ct = 0;
        int prv = 0;
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        for (int[] interval : arr) {
            int st = interval[0];
            int end = interval[1];
            if(st < prv)
                prv = Math.max(prv, end);
            else{
                prv = end;
                ct++;
            }
        }
        return ct;
    }
}
