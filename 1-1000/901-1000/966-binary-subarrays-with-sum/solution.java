class Solution {
    public int count(int[] nums,int k){
        int sum = 0,l = 0,ans = 0;
        for(int r=0;r<nums.length;r++){
            sum += nums[r];
            while(sum > k && l < r)
                sum -= nums[l++];
            if(sum <= k)
                ans += r - l + 1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums,goal) - count(nums,goal-1);
    }
}
