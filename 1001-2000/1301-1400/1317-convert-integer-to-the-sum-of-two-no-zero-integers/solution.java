class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int a = 1; a < n; a++) {
            int b = n - a;
            if (isValid(a) && isValid(b))
                return new int[]{a, b};
        }
        return new int[0];
    }

    private boolean isValid(int n) {
        while (n > 0) {
            if (n % 10 == 0) return false;
            n /= 10;
        }
        return true;
    }
}
