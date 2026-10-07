class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int ct = 1;
        int id = 0;
        for(int l = 0, r = 0 ; r < n ; r++){
            if(r > 0 && nums[r - 1] + 1 == nums[r])
                ct++;
            if(r - l + 1 > k){
                if(nums[l] + 1 == nums[l + 1])
                    ct--;
                l++;
            }
            if(r - l + 1 == k)
                ans[id++] = (ct == k) ? nums[r] : -1;
        }
        return ans;
    }
}
