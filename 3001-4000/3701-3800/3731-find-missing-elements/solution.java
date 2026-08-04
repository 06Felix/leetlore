class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        boolean[] seen = new boolean[101];
        int min = 101;
        int max = 0;
        List<Integer> ans = new ArrayList<>();

        for (int num : nums) {
            seen[num] = true;
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        for (int i = min + 1; i <= max - 1; ++i)
            if (!seen[i])
                ans.add(i);
        
        return ans;
    }
}
