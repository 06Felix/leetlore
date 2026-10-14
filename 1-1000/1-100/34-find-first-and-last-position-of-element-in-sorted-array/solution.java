class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                ans[0] = i;
                while(i < n - 1 && nums[i] == nums[i + 1])
                    i++;
                ans[1] = i;
                break;
            }                
        }
        return ans;
    }
}
