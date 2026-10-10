class Solution {
    public int subsetXORSum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            ans |= nums[i];
        }
        return ans << n - 1;
    }
}
