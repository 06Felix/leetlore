class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long ans = 0, sum = 0;
        int dt = 0;
        Map<Integer, Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            sum += nums[i];
            if(m.merge(nums[i], 1, Integer::sum) == 1)
                ++dt;
            if(i >= k){
                if(m.merge(nums[i - k], -1, Integer::sum) == 0)
                    --dt;
                sum -= nums[i - k];
            }
            if(i >= k - 1 && dt == k)
                ans = Math.max(ans, sum);
        }
        return ans;
    }
}
