class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int mx = 2000;
        Set<Integer> st = new HashSet<>();
        for(int x : nums)
            st.add(x);
        int total = st.size();
        int ans = 0;
        int dt = 0;
        int[] ct = new int[mx + 1];
        int l = 0;
        for (int x : nums) {
            if (++ct[x] == 1)
                dt++;
            while (dt == total)
                if (--ct[nums[l++]] == 0)
                    dt--;
            ans += l;
        }
        return ans;
    }
}
