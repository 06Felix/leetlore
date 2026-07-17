class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> ct = new HashMap<>();
        int ans = 0;
        for(int l = 0, r = 0 ; r < nums.length ; r++){
            ct.put(nums[r],ct.getOrDefault(nums[r],0) + 1);
            while(ct.get(nums[r]) > k){
                ct.put(nums[l],ct.get(nums[l]) - 1);
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
