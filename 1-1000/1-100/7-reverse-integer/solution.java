class Solution {
    public int reverse(int x) {
        boolean isNeg = false;
        if (x < 0) {
            x *= -1;
            isNeg = true;
        }
        int y = x;
        long rev = 0;
        while (y > 0) {
            rev = (rev * 10) + (y % 10);
            y /= 10;
        }
        if (rev < -2147483648 || rev > 2147483647)
            return 0;
        return (int) rev * (isNeg ? -1 : 1);
    }
}
