class Solution {
    public int differenceOfSums(int n, int m) {
        int num = n / m;
        num = m * num * (num + 1) / 2;
        n = (n * (n + 1) / 2) - num;
        return n - num;
    }
}
