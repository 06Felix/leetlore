class Solution {
    public void swap(int nums[], int l, int i) {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }

    public void permutations(List<List<Integer>> res, int[] nums, int l, int h) {
        if (l == h) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            if(!res.contains(permutation))
                res.add(permutation);
            return;
        }
        for (int i = l; i <= h; i++) {
            swap(nums, l, i);
            permutations(res, nums, l + 1, h);
            swap(nums, l, i);
        }
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int x = nums.length - 1;
        permutations(res, nums, 0, x);
        return res;
    }
}
