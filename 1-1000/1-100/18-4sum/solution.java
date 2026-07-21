class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 4) {
            return result;
        }
        Arrays.sort(nums);
        findSum(result, new ArrayList<>(), nums, 0, (long)(target), 0);
        return result;
    }

    private void findSum(List<List<Integer>> result, List<Integer> current, int[] nums,
                                      int start, long target, int count) {
        if (count == 4) {
            if (target == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            current.add(nums[i]);
            findSum(result, current, nums, i + 1, target - nums[i], count + 1);
            current.remove(current.size() - 1);
        }
    }
}
