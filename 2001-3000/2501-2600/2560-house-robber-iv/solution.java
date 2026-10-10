class Solution {
    public int minCapability(int[] nums, int k) {
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        int n = nums.length;
        for(int x : nums) {
            l = Math.min(l, x);
            r = Math.max(r, x);
        }
        while(l < r) {
            int m = (l + r) / 2;
            if(find(nums, m, n) >= k)
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    private int find(int[] arr, int k, int n){
        int ct = 0;
        for(int i = 0; i < n; i++)
            if(arr[i] <= k) {
                ct++;
                i++;
            }
        return ct;
    }
}
