class Solution {
    public int minOperations(int[] nums) {
        int prv = nums[0];
        int ans = 0;
        int n = nums.length;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] <= prv){
                ans += prv - nums[i] + 1;
                nums[i] = prv + 1;
            }
            prv = nums[i];
        }
        return ans;
    }
}
