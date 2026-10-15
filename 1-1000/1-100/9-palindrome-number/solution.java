class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int revno = 0;
        int y = x;
        while(x > 0){
            int rem = x % 10;
            revno = revno * 10 + rem;
            x /= 10;
        }
        return y == revno;
    }
}
