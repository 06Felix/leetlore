class Solution {
    public int minFlipsMonoIncr(String s) {
        int dp = 0, ct1 = 0;
        for(char ch : s.toCharArray())
            if(ch == '0')
                dp = Math.min(ct1, dp + 1);
            else
                ct1++;
        return dp;
    }
}
