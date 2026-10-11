class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] dx = new int[n + 1];
        for (int[] query : queries) {
            int li = query[0];
            int ri = query[1];
            dx[li]--;
            dx[ri + 1]++;
        }
        int dec = 0;
        for (int i = 0; i < n; i++) {
            dec += dx[i];
            nums[i] += dec;
            if(nums[i] > 0)
                return false;
        }
        return true;
    }
}
