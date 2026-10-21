class Solution {
    public int search(int[] nums, int target) {
        int n = Arrays.binarySearch(nums, target);
        return n >= 0 ? n : -1;
    }
}
