class Solution {
    public long flowerGame(int n, int m) {
        long lOdd = (n + 1) / 2;
        long lEven = n / 2;
        long rOdd = (m + 1) / 2;
        long rEven = m / 2;
        return lOdd * rEven + lEven * rOdd;
    }
}
