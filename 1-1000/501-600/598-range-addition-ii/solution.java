class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int xm = m;
        int ym = n;
        for(int[] arr : ops){
            if(arr[0] < xm)
                xm = arr[0];
            if(arr[1] < ym)
                ym = arr[1];
        }
        return xm * ym;
    }
}
