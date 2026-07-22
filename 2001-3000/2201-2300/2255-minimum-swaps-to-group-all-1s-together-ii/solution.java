class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int ct = 0;
        for(int nm : nums)
            if(nm == 1)
                ct++;
        int mx = 0, cur = 0;
        for(int i = 0 ; i < 2 * n ; i++){
            if(i >= ct && nums[(i - ct) % n] == 1)
                cur--;
            if(nums[i % n] == 1)
                cur++;
            mx = Math.max(mx, cur);
        }
        return ct - mx;
    }
}
