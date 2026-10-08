class Solution {
    public int subarraySum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            int j = Math.max(0, i - nums[i]);
            while(j <= i){
               ans += nums[j];
               j++;
            }
        }
        return ans;
    }
}
