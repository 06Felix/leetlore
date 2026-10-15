class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int rS = 0;
        for(int x : nums)
            rS += x;
        int ans = 0, lS = 0;
        for(int i = 0 ; i < n - 1; i++){
            lS += nums[i];
            rS -= nums[i];
            if((rS - lS) % 2 == 0)
                ans++;
        }
        return ans;
    }
}
