class Solution {
    public double separateSquares(int[][] squares) {
        double tot = 0;
        double minY = Double.MAX_VALUE, maxY = Double.MIN_VALUE;
        for (int[] sq : squares) {
            int x = sq[0], y = sq[1], l = sq[2];
            tot += (long) l * l;
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y + l);
        }
        double req = tot / 2.0;
        double l = minY, r = maxY;
        while (r - l > 1e-5) {
            double m = (l + r) / 2.0;
            if(find(squares, m) < req)
                l = m;
            else
                r = m;
        }
        return l;
    }

    private double find(int[][] squares, double yLine) {
        double area = 0;
        for (int[] sq : squares) {
            int x = sq[0], y = sq[1], l = sq[2];
            if (y + l <= yLine)
                area += (long) l * l;
            else if (y < yLine) {  
                double h = yLine - y;
                area += h * l;
            }
        }
        return area;
    }
}
