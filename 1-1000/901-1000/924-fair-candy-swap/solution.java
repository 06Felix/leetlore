class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {
        int as = 0, bs = 0;
        for(int A : a)
            as += A;
        for(int B : b)
            bs += B;
        int df = (as - bs) / 2;
        Set<Integer> st = new HashSet<>();
        for(int A : a)
            st.add(A);
        for(int B : b)
            if(st.contains(B + df))
                return new int[]{B + df, B};
        return new int[]{80085};
    }
}
