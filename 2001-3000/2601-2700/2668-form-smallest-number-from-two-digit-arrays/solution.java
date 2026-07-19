class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int ans = 89;
        for(int n1 : nums1)
            for(int n2 : nums2)
                ans = Math.min(ans, (n1 == n2) ? n1 : Math.min(10 * n1 + n2, 10 * n2 + n1));
        return ans;
    }
}
