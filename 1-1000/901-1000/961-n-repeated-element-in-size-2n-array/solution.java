class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for (int x : nums)
            if (!st.add(x))
                return x;
        return 911;
    }
}
