class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int m = rolls.length;
        int actSum = mean * (m + n);
        int curSum = 0;
        for(int x : rolls)
            curSum += x;
        int reqSum = actSum - curSum;
        if(reqSum > n * 6 || reqSum < n)
            return new int[]{};
        int[] ans = new int[n];
        Arrays.fill(ans, reqSum / n);
        reqSum %= n;
        for(int i = 0 ; i < reqSum ; i++)
            ans[i]++;
        return ans;
    }
}
