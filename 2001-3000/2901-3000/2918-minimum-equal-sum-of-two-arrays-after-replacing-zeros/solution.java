class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long s1 = Arrays.stream(nums1).asLongStream().sum();
        long s2 = Arrays.stream(nums2).asLongStream().sum();
        long z1 = Arrays.stream(nums1).filter(num -> num == 0).count();
        long z2 = Arrays.stream(nums2).filter(num -> num == 0).count();
        if (z1 == 0 && s1 < s2 + z2)
            return -1;
        if (z2 == 0 && s2 < s1 + z1)
            return -1;
        return Math.max(s1 + z1, s2 + z2);
    }
}
