class Solution {
    public String mostCommonWord(String p, String[] banned) {
        p = p.toLowerCase();
        Set<String> s = new HashSet<>(Arrays.asList(banned));
        Map<String, Integer> m = new HashMap<>();
        String t = "";
        for(char c : p.toCharArray()){
            if(Character.isAlphabetic(c))
                t += c;
            else if(t.length() != 0){
                m.put(t, m.getOrDefault(t, 0) + 1);
                t = "";
            }
        }
        if(t.length() != 0)
            m.put(t, m.getOrDefault(t, 0) + 1);
        String ans = "";
        int ct = 0;
        for(String x : m.keySet()){
            if(!s.contains(x) && m.get(x) > ct){
                ans = x;
                ct = m.get(x);
            }
        }
        return ans;
    }
}
