class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Set<Integer> s = new HashSet<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int x : nums){
            s.add(x);
            m.put(x,m.getOrDefault(x,0) + 1);
            if(m.get(x) > 2)
                return false;
        }
        return s.size() >= nums.length / 2;
    }
}
