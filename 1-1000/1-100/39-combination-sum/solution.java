class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private int[] arr;
    private int n;
    private int target;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.arr = candidates;
        this.n = candidates.length;
        this.target = target;
        find(0, 0, new ArrayList<>());
        return ans;
    }
    private void find(int i, int sum, List<Integer> l) {
        if (i == n || sum > target)
            return;
        if (sum == target) {
            ans.add(new ArrayList<>(l));
            return;
        }
        find(i + 1, sum, l);
        l.add(arr[i]);
        find(i, sum + arr[i], l);
        l.remove(l.size() - 1);
    }
}
