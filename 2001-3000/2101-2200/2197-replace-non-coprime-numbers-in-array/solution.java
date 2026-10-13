class Solution {
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    private int lcm(int a, int b, int lcm) {
        return (int) ((1L * a * b) / lcm);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();
        for (int num : nums) {
            while (!st.isEmpty()) {
                int last = st.getLast();
                int gcd = gcd(num, last);
                if (gcd == 1)
                    break;
                else {
                    st.pollLast();
                    int lcm = lcm(num, last, gcd);
                    num = lcm;
                }
            }
            st.offerLast(num);
        }
        for (int x : st)
            ans.add(x);
        return ans;
    }
}
