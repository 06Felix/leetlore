class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] dp = new int[10001];
        for(int n : nums)
            dp[n] += n;
        int prv1 = 0, prv2 = 0;
        for(int n : dp){
            int curMx = Math.max(prv1, prv2 + n);
            prv2 = prv1;
            prv1 = curMx;
        };
        return prv1;
    }
}
