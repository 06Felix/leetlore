class Solution {
    public String robotWithString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] ct = new int[26];
        char[] str = s.toCharArray();
        Deque<Character> st = new ArrayDeque<>();
        for (char c : str)
            ++ct[c - 'a'];
        for (char c : str) {
            st.push(c);
            --ct[c - 'a'];
            while (!st.isEmpty() && st.peek() <= find(ct))
                sb.append(st.pop());
        }
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
    private char find(int[] ct) {
        for (int i = 0; i < 26; ++i)
            if (ct[i] > 0)
                return (char) ('a' + i);
        return 'a';
    }
}
