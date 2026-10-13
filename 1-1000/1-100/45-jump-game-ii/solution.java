class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int end = 0;
        int far = 0;
        for (int i = 0; i < n - 1; i++) {
            far = Math.max(far, i + nums[i]);
            if (far >= nums.length - 1) {
                ans++;
                break;
            }
            if (i == end) { 
                ans++;          
                end = far; 
            }
        }

        return ans;
    }
}
