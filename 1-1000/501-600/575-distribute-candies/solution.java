class Solution {
    public int distributeCandies(int[] cT) {
        int n = cT.length / 2;
        Set<Integer> s = new HashSet<>();
        for(int c : cT){
            if(s.size() < n)
                s.add(c);
            else
                break;
        }
        return s.size();
    }
}
