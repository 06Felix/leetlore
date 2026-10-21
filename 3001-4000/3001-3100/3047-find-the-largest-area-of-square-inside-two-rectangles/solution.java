class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long ans = 0;
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i + 1; j < bottomLeft.length; j++) {
                long x1 = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                long y1 = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                long x2 = Math.min(topRight[i][0], topRight[j][0]);
                long y2 = Math.min(topRight[i][1], topRight[j][1]);
                long side = Math.min(x2 - x1, y2 - y1);
                if (side > 0)
                    ans = Math.max(ans, side * side);
            }
        }
        return ans;
    }
}
