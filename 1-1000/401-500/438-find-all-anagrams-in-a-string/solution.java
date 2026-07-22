class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] ct = new int[128];
        int rq = p.length();
        for(char ch : p.toCharArray())
            ct[ch]++;
        for (int l = 0, r = 0; r < s.length(); ++r) {
            if (--ct[s.charAt(r)] >= 0)
                rq--;
            while (rq == 0) {
                if (r - l + 1 == p.length())
                    ans.add(l);
                if (++ct[s.charAt(l++)] > 0)
                    ++rq;
            }
        }
        return ans;
    }
}
