class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> m = new HashMap<>();
        Set<Integer> s = new HashSet<>();
        for(int n : arr)
            m.merge(n,1,Integer::sum);
        for(int val : m.values())
            if(!s.add(val))
                return false;
        return true;
    }
}
