class Solution {
    public int minImpossibleOR(int[] nums) {
        int ans = 1;
        Set<Integer> s = new HashSet<>();
        for(int n : nums)
            s.add(n);
        while(s.contains(ans))
            ans <<= 1;
        return ans;
    }
}
