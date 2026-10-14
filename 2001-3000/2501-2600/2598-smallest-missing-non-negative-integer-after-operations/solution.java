class Solution {
    public int findSmallestInteger(int[] nums, int val) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int n : nums)
            m.merge((n % val + val) % val, 1, Integer::sum);
        int ans = 0;
        while(true){
            if(m.getOrDefault(ans % val, 0) == 0)
                return ans;
            m.merge(ans % val, -1, Integer::sum);
            ans++;
        }
    }
}
