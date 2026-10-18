class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int i = 0, j = n, id = 0;
        while(i < n){
            ans[id++] = nums[i++];
            ans[id++] = nums[j++];
        }
        return ans;
    }
}
