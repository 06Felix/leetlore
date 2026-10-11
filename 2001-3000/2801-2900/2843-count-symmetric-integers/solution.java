class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ct = 0;
        for(int i = low; i <= high; i++)
            if(sym(i))
                ct++;
        return ct;
    }
    private boolean sym(int n){
        if(n >= 10 && n <= 99)
            return n / 10 == n % 10;
        if(n >= 1001 && n <= 9999){
            int l = n / 100;
            int r = n % 100;
            return l / 10 + l % 10 == r / 10 + r % 10;
        }
        return false;
    }
}
