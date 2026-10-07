class Solution {
    public int maximumBeauty(int[] nums, int k) {
        Arrays.sort(nums);
        int min = 0;
        int max = 0;
        int n = nums.length;
        int right = 0;
        int left = 0;
        while(right < n) {
            while(right < n && nums[right] - nums[left] <= 2 * k) {
                min++;
                right++;
            }
            max = Math.max(max , min);
            if(right == n)
                break;
            while(left <= right && nums[right] - nums[left] > 2 * k) {
                left++;
                min--;
            }
        }
        return max;
    }
}
