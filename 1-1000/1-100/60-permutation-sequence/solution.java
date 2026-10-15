class Solution {
    public String getPermutation(int n, int k) {
        int ans = 0;
        List<Integer> nums = new ArrayList<>();
        int[] fact = new int[n + 1];
        fact[0] = fact[1] = 1;
        for (int i = 1; i <= n; ++i)
            nums.add(i);
        for (int i = 2; i <= n; ++i)
            fact[i] = fact[i - 1] * i;
        k--;
        for (int i = n - 1; i >= 0; --i) {
            int j = k / fact[i];
            k %= fact[i];
            ans = ans * 10 + nums.get(j);
            nums.remove(j);
        }

        return String.valueOf(ans);
    }
}
