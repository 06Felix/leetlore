class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ;i++){
            if(i - k >= 0)
                if(nums[i] <= nums[i - k])
                    continue;
            if(i + k < n)
                if(nums[i] <= nums[i + k])
                    continue;
            ans += nums[i];
        }
        return ans;
    }
}
