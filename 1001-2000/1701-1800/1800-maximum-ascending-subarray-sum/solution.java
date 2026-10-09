class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = nums[0];
        int cur = nums[0];
        int n = nums.length;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i + 1] > nums[i]){
                cur += nums[i + 1];
                ans = Math.max(ans, cur);
            }
            else
                cur = nums[i + 1];
        }
        return ans;
    }
}
