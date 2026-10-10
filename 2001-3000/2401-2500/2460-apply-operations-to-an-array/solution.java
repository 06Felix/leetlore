class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int id = 0;
        for(int i = 0 ; i < n ; i++) {
            if(nums[i] == 0)
                continue;
            if(i < n - 1 && nums[i] == nums[i + 1]){
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
            ans[id++] = nums[i];    
        }
        return ans;        
    }
}
