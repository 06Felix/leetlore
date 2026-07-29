class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        for(String st : s1.split(" "))
            m.merge(st, 1, Integer::sum);
        for(String st : s2.split(" "))
            m.merge(st, 1, Integer::sum);
        for(String st : m.keySet())
            if(m.get(st) == 1)
                ans.add(st);
        return ans.toArray(new String[0]);
    }
}
