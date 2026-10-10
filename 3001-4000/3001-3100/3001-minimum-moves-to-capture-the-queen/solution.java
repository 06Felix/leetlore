class Solution {
    public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
        if(a == e){
            if((a == c) && ((b < d && d < f) || (b > d && d > f)))
                return 2;
            return 1;
        }
        else if(b == f){
            if(b == d && ((a < c && c < e) || (a > c && c > e)))
                return 2;
            return 1;
        }
        else if(c + d == e + f){
            if(a + b == c + d && ((c < a && a < e) || (c > a && a > e)))
                return 2;
            return 1;
        }
        else if(c - d == e - f){
            if(a - b == c - d && ((c < a && a < e) || (c > a && a > e)))
                return 2;
            return 1;
        }
        return 2;
    }
}
