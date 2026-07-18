class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] ch1 = new int[101];
        int[] ch2 = new int[101];
        for (int i : nums1) {
            ch1[i] = 1;
        }
        for (int i : nums2) {
            ch2[i] = 1;
        }
        int[] result = new int[2];
        for (int i : nums1) {
            result[0] += ch2[i];
        }
        for (int i : nums2) {
            result[1] += ch1[i];
        }

        return result;

    }
}
