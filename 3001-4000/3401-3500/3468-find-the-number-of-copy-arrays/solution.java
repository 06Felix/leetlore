class Solution {
    private int[] merge(int a, int b, int x, int y){
        if(a > y || x > b)
            return new int[0];
        return new int[]{Math.max(a, x), Math.min(b, y)};
    } 
    public int countArrays(int[] original, int[][] bounds) {
        int n = original.length;
        for(int i = 1; i < n; i++){
            int df = original[i] - original[i - 1];
            int pl = bounds[i - 1][0];
            int pr = bounds[i - 1][1];
            bounds[i] = merge(pl + df, pr + df, bounds[i][0], bounds[i][1]);
            if(bounds[i].length == 0)
                return 0;
        }
        return bounds[n - 1][1] - bounds[n - 1][0] + 1;
    }
}
