class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        int ans = 0;
        long sum = 0;
        long cur = 0;
        for(int x : nums)
            sum += x;
        for(int i = 0 ; i < n - 1 ; i++){
            sum -= nums[i];
            cur += nums[i];
            if(cur >= sum)
                ans++;
        }
        return ans;
    }
}
