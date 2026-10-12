class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n == 0)
            return 0;
        int ans = 1;
        int i = 1,ct = 1;
        while(i < n){
            if(nums[i] > nums[i-1])
                ct++;
            else{
                ans = Math.max(ans,ct);
                ct = 1;
            }
            i++;
        }
        return Math.max(ans,ct);
    }
}
