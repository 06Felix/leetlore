class Solution {
    public int countTriples(int n) {
        int ans = 0;
        Set<Integer> st = new HashSet<>();
        for (int i = 1; i <= n; ++i)
            st.add(i * i);
        for (int a : st)
            for (int b : st)
                if (st.contains(a + b))
                    ++ans;
        return ans;
    }
}
