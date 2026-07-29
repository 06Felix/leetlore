class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)
            return 0;
        int ans = 0;
        int p = 1;
        for(int l = 0, r = 0 ; r < nums.length ; r++){
            p *= nums[r];
            while(p >= k){
                p /= nums[l];
                l++;
            }
            ans += r - l + 1;
        }
        return ans;
    }
}
