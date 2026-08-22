class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int prd = 1;
        int sum = 0;

        while (n > 0) {
            int dig = n % 10;
            sum += dig;
            prd *= dig;

            n /= 10;
        }

        return num % (sum + prd) == 0;
    }
}
