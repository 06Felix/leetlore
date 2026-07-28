class Solution {
    private int sod(int n){
        if(n <= 9)
            return n;
        int ans = 0;
        while(n > 0){
            ans += (n % 10);
            n /= 10;
        }
        return ans;
    }
    public int getLucky(String s, int k) {
        k--;
        int ans = 0;
        for(char ch : s.toCharArray())
            ans += sod((int)(ch - 'a' + 1));
        while(k-- > 0 && ans > 9)
            ans = sod(ans);
        return ans;
    }
}
