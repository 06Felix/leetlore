class Solution {
    private boolean isP(String s){
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;
        while(l < r)
            if(ch[l++] != ch[r--])
                return false;
        return true;
    }
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; ++i)
        map.put(new StringBuilder(words[i]).reverse().toString(), i);

        for (int i = 0; i < words.length; ++i) {
            String word = words[i];
            if (map.containsKey("") && map.get("") != i && isP(word))
                ans.add(Arrays.asList(i, map.get("")));
            for (int j = 1; j <= word.length(); ++j) {
                String l = word.substring(0, j);
                String r = word.substring(j);
                if (map.containsKey(l) && map.get(l) != i && isP(r))
                    ans.add(Arrays.asList(i, map.get(l)));
                if (map.containsKey(r) && map.get(r) != i && isP(l))
                    ans.add(Arrays.asList(map.get(r), i));
            }
        }

        return ans;
    }
}
