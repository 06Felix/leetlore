class Solution {
    public int differenceOfSum(int[] nums) {
        int es = 0;
        int ds = 0;
        for(int n : nums){
            es += n;
            ds += sod(n);
        }
        return Math.abs(es - ds);
    }
    private static int sod(int n){
        int ans = 0;
        while(n > 0){
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
}
