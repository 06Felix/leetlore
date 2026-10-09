class Solution {
    private int sod(int n){
        int sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int ans = -1;
        int[] dp = new int[82];
        for(int x : nums){
            int cur = sod(x);
            if(dp[cur] != 0)
                ans = Math.max(ans, dp[cur] + x);
            dp[cur] = Math.max(dp[cur], x);
        }
        return ans;
    }
}
