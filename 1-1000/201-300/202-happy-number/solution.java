class Solution {
    public boolean isHappy(int n) {
        while(n > 4){
            int m = n;
            int x = 0;
            while(m > 0){
                x += Math.pow(m % 10, 2);
                m /= 10;
            }
            n = x;
        }
        return n == 1;
    }
}
