class Solution {
    private int ans = 0;
    public int countMaxOrSubsets(int[] nums) {
        int mx = 0;
        for(int x : nums)
            mx |= x;
        dfs(0, 0, nums, mx);
        return ans;
    }
    private void dfs(int i, int cur, int[] nums, int req){
        if(i == nums.length){
            if(cur == req)
                ans++;
            return;
        }
        dfs(i + 1, cur | nums[i], nums, req);
        dfs(i + 1, cur, nums, req);
    }
}
