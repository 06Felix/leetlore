class Solution {
    public int monotoneIncreasingDigits(int num) {
        // int n = (int)Math.ceil((Math.log(n + 1) / Math.log(10)));
        int prv = -1;
        int ans = 0;
        int pow = 1;
        int stPow = -1;
        while(num > 0){
            int cur = num % 10;
            if(prv != -1 && cur > prv){
                ans = 0;
                cur--;
                stPow = pow / 10;
            }
            prv = cur;
            ans += (cur * pow);
            pow *= 10;
            num /= 10;
        }
        while(stPow > 0){
            ans += (9 * stPow);
            stPow /= 10;
        }
        return ans;
    }
}
