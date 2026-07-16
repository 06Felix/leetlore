class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0,n = nums.length;
        for(int i=0;i<nums.length;i++)
            ans += nums[i];
        return n*(n+1)/2 - ans;
    }
}
