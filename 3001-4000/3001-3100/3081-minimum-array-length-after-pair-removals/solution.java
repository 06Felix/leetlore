class Solution {
    public int minLengthAfterRemovals(List<Integer> nums) {
        int n = nums.size();
        int i = 0;
        int j = n / 2;
        int rmv = 0;
        while (i < n / 2 && j < n) {
            if (nums.get(i) < nums.get(j)) {
                rmv += 2;
                i++;
                j++;
            }
            else
                j++;
        }
        return n - rmv;
    }
}
