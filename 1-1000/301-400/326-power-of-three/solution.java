class Solution {
    public boolean isPowerOfThree(int n) {
        long x = 1;
        while(x <= n){
            if(x == n)
                return true;
            x *= 3;
        }
        return false;
    }
}
