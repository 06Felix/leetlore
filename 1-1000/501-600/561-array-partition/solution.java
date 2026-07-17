class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i+=2)
            ans += nums[i];
        return ans;
    }
}
