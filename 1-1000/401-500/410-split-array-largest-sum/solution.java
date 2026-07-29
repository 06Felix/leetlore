class Solution {
    public int splitArray(int[] nums, int k) {
        int l = 0, r = 0;
        for(int x : nums){
            r += x;
            l = Math.max(l, x);
        }
        while(l < r){
            int m = (l + r) / 2;
            if(check(nums, m, k))
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    private boolean check(int[] nums, int sum, int k){
        int rs = 0, ct = 1;
        for(int x : nums){
            rs += x;
            if(rs > sum){
                ct++;
                rs = x;
            }
        }
        return ct <= k;
    }
}
