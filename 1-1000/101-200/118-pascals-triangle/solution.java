class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Integer[] arr = new Integer[i + 1];
            Arrays.fill(arr, 1);
            for (int j = 1; j < i; j++)
                arr[j] = ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1);
            ans.add(Arrays.asList(arr));
        }
        return ans;
    }
}
