class Solution {
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
    private int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    public int maxLength(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int cur = 1, h = 0, l = 1;
            for(int j = i ; j < n ; j++){
                cur *= nums[j];
                l = lcm(l, nums[j]);
                h = gcd(h, nums[j]);
                if(cur == l * h)
                    ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}
