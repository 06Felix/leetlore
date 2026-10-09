class Solution {
    public int fib(int n) {
        return (int)Math.ceil((Math.pow(3.236067977, n) - Math.pow(1.236067977, n)) / ((1 << n) * 2.236067977));
    }
}
