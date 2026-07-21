class Solution {
    private Map<Integer, List<Integer>> m = new HashMap<>();
    private Random r = new Random();
    public Solution(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            m.putIfAbsent(nums[i], new ArrayList<>());
            m.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        List<Integer> l = m.get(target);
        return l.get(r.nextInt(l.size()));
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
