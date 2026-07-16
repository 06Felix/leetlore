class Solution {
    public int distanceTraveled(int m, int a) {
        if(m >= 5 && a > 0)
            return 50 + distanceTraveled(m-4,a-1);
        return m * 10;
    }
}
