class Solution {
    public long countSubarrays(int[] nums, int k) {
        int mx = Integer.MIN_VALUE;
        for(int x : nums)
            mx = Math.max(mx,x);
        long ans = 0;
        int ct = 0;
        for(int l = 0, r = 0 ; r < nums.length ; r++){
            if(nums[r] == mx)
                ct++;
            while(ct == k)
                if(nums[l++] == mx)
                    ct--;
            ans += l;
        }
        return ans;
    }
}
