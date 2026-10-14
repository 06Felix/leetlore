class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for (int x : nums)
            if (ans.isEmpty() || x > ans.get(ans.size() - 1))
                ans.add(x);
            else
                ans.set(getInd(ans, x), x);
        return ans.size();
    }

    private int getInd(List<Integer> l, int t) {
        int ix = Collections.binarySearch(l, t);
        return ix < 0 ? -ix - 1 : ix;
    }
}
