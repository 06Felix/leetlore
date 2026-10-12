class Solution {
    private int find(int[] a, int[] b) {
        int x = a[0] * a[0] + a[1] * a[1];
        int y = b[0] * b[0] + b[1] * b[1];
        if (x > y)
            return -1;
        else if (y > x)
            return 1;
        return a[0] * a[1] > b[0] * b[1] ? -1 : 1;
    }
    public int areaOfMaxDiagonal(int[][] dimensions) {
        Arrays.sort(dimensions, ((a, b) -> find(a, b)));
        return dimensions[0][0] * dimensions[0][1];
    }
}
