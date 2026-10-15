class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int rsum = 0;
        for(int x : nums)
            rsum += x;
        int lsum = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            rsum -= nums[i];
            if(lsum == rsum && nums[i] == 0)
                ans += 2;
            else if(Math.abs(lsum - rsum) == 1 && nums[i] == 0)
                ans++;
            lsum += nums[i];
        }
        return ans;
    }
}
