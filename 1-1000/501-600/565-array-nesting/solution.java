class Solution {
    public int arrayNesting(int[] nums) {
        int ans = 0;
        for(int num : nums){
            if(num == -1)
                continue;
            int ct = 0;
            int id = num;
            while(nums[id] != -1){
                int t = id;
                id = nums[id];
                nums[t] = -1;
                ct++;
            }
            ans = Math.max(ans, ct);
        }
        return ans;
    }
}
