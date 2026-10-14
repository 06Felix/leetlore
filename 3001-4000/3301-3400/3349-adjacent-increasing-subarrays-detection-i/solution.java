class Solution {
    private int[] arr;
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();
        arr = new int[n];
        int idx = 0;
        for (int x : nums)
            arr[idx++] = x;
        for (int i = 0; i < n - 2 * k + 1; i++)
            if (isIncreasing(i, i + k - 1) && isIncreasing(i + k, i + 2 * k - 1))
                return true;
        return false;
    }

    private boolean isIncreasing(int l, int r) {
        for (int i = l + 1; i <= r; i++)
            if (arr[i - 1] >= arr[i])
                return false;
        return true;
    }
}
