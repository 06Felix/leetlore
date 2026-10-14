class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public void swap(int nums[], int l, int i) {
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }

    public void permutations(int[] nums, int l, int h) {
        if (l == h) {
            List<Integer> p = new ArrayList<>();
            for (int x : nums)
                p.add(x);
            ans.add(p);
            return;
        }
        for (int i = l; i <= h; i++) {
            swap(nums, l, i);
            permutations(nums, l + 1, h);
            swap(nums, l, i);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        permutations(nums, 0, n - 1);
        return ans;
    }
}
