class Solution {
    public boolean canMeasureWater(int x, int y, int t) {
        return t == 0 || x + y >= t && t % gcd(x, y) == 0;
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
