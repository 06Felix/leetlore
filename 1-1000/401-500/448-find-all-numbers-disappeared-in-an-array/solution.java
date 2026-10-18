class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean visited[] = new boolean[nums.length + 1];
        for (int i = 0; i < nums.length; i++)
            visited[nums[i]] = true;
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++)
            if (visited[i] != true)
                ans.add(i);
        return ans;
    }
}
