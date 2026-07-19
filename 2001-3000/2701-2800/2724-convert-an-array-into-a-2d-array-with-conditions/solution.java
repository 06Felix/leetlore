class Solution {
  public List<List<Integer>> findMatrix(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int[] ct = new int[nums.length + 1];

    for (int num : nums) {
      if (++ct[num] > ans.size())
        ans.add(new ArrayList<>());
      ans.get(ct[num] - 1).add(num);
    }

    return ans;
  }
}
