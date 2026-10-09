class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int cur = 1;
        int ans = 1;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i + 1] > nums[i]){
                cur++;
                ans = Math.max(ans, cur);
            }
            else
                cur = 1;
        }
        cur = 1;
        for(int i = 0 ; i < n - 1 ; i++){
            if(nums[i + 1] < nums[i]){
                cur++;
                ans = Math.max(ans, cur);
            }
            else
                cur = 1;
        }
        return ans;
    }
}
