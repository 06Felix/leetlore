class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int count = target.length;
        int idx = 0;
        for (int i = 1; i <= n; ++i) {
            ans.add("Push");
            if (target[idx] == i) {
                if (++idx == count)
                    break;
            } else {
                ans.add("Pop");
            }
        }
        return ans;
    }
}
