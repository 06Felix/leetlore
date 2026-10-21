class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        find(1, n, k, new ArrayList<>());
        return ans;
    }
    private void find(int i, int n, int k, ArrayList<Integer> l) {
        if (k == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }
        if (i > n)
            return;
        for (int cur = i; cur <= n; cur++) {
            l.add(cur);
            find(cur + 1, n, k - 1, l);
            l.remove(l.size() - 1);
        }
    }
}
