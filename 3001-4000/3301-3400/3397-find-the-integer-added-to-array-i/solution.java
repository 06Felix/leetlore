class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int m1 = Integer.MAX_VALUE;
        int m2 = Integer.MAX_VALUE;
        for(int n : nums1)
            m1 = Math.min(m1, n);
        for(int n : nums2)
            m2 = Math.min(m2, n);
        return m2 - m1;
    }
}
