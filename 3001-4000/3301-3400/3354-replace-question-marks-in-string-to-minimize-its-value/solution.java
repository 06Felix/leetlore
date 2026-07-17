class Solution {
    public String minimizeStringValue(String s) {
        int n = s.length();
        // StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];
        for (char c: s.toCharArray()) {
            if (c != '?') {
                freq[c-'a']++;
            }
        }
        List<Character> list = new ArrayList<>();
        for (char c: s.toCharArray()) {
            if (c == '?') {
                int min = freq[0];
                char ch = 'a';
                for (int i = 0; i < 26; i++) {
                    if (freq[i] < min) {
                        min = freq[i];
                        ch = (char)(i+'a');
                    }
                }
                list.add(ch);
                freq[ch-'a']++;
            } 
        }
        Collections.sort(list);
        
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (char c: s.toCharArray()) {
            if (c == '?') {
                sb.append(list.get(i));
                i++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
