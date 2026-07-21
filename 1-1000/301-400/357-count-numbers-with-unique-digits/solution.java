class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
            return 1;
        int ans = 10;
        int ud = 9;
        for(int av = 9 ; n > 1 && av > 0 ; n--, av--){
            ud *= av;
            ans += ud;
        }
        return ans;
    }
}
