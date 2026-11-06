class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans = 0;

        for (int num : arr1) {
            boolean good = true;

            for (int val : arr2) {
                if (Math.abs(num - val) <= d) {
                    good = false;
                    break;
                }
            }

            if (good)
                ++ans;
        }

        return ans;
    }
}
