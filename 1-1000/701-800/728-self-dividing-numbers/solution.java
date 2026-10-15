class Solution {
    private List<Integer> ans = new ArrayList<>();
    public List<Integer> selfDividingNumbers(int left, int right) {
        for (int i = left; i <= right; ++i)
            if (check(i))
                ans.add(i);
        return ans;
    }
    private boolean check (int n) {
        int m = n;
        while (m > 0) {
            int dig = m % 10;
            if (dig == 0 || n % dig > 0)
                return false;
            m /= 10;
        }
        return true;
    }
}
