class Solution {
    int mod10(int n, int k) {
        int r2 = mod2(n, k);
        int r5 = mod5(n, k);
        for (int i = 0; i < 10; i++)
            if (i % 2 == r2 && i % 5 == r5)
                return i;
        return 0;
    }
    int mod2(int n, int k) {
        return ((n & k) == k) ? 1 : 0;
    }
    int mod5(int n, int k) {
        int[][] arr = {{1}, {1, 1}, {1, 2, 1}, {1, 3, 3, 1}, {1, 4, 1, 4, 1}};
        int ans = 1;
        while(n > 0 || k > 0) {
            int n5 = n % 5;
            int k5 = k % 5;
            if(k5 > n5)
                return 0;
            ans *= arr[n5][k5];
            ans %= 5;
            k /= 5;
            n /= 5;
        }
        return ans;
    }
    public boolean hasSameDigits(String s) {
        int a = 0, b = 0;
        char[] arr = s.toCharArray();
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int c = mod10(n - 2, i);
            a = (a + c * (arr[i] - '0')) % 10;
            b = (b + c * (arr[i + 1] - '0')) % 10;
        }
        return a == b;
    }
}
