class Solution {
    public int longestNiceSubarray(int[] arr) {
        int ans = 0;
        int cur = 0;
        for (int l = 0, r = 0; r < arr.length; ++r) {
            while ((cur & arr[r]) > 0)
                cur ^= arr[l++];
            cur |= arr[r];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
