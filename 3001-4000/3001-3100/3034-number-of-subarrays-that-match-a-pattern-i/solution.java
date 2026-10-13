class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        int n = nums.length;
        int m = pattern.length;
        int ans = 0;
        outer: for(int i = 0; i < n - m; i++){
            for(int j = 1; j <= m; j++){
                if(nums[i + j] > nums[i + j - 1] && pattern[j - 1] == 1)
                    continue;
                else if(nums[i + j] == nums[i + j - 1] && pattern[j - 1] == 0)
                    continue;
                else if(nums[i + j] < nums[i + j - 1] && pattern[j - 1] == -1)
                    continue;
                else
                    continue outer;
            }
            ans++;
        }
        return ans;
    }
}
