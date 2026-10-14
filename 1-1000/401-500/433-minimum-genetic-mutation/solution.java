class Solution {
    private char[] genes = {'A', 'C', 'G', 'T'};
    public int minMutation(String start, String end, String[] bank) {
        Set<String> bankSet = new HashSet<>(Arrays.asList(bank));
        if (!bankSet.contains(end))
            return -1;

        int ans = 0;
        Queue<String> q = new ArrayDeque<>();
        q.offer(start);

        while (!q.isEmpty()) {
            ++ans;
            for (int sz = q.size(); sz > 0; --sz) {
                StringBuilder sb = new StringBuilder(q.poll());
                int l = sb.length();
                for (int j = 0; j < l; ++j) {
                    char cache = sb.charAt(j);
                    for (char c : genes) {
                        if (c == cache)
                            continue;
                        sb.setCharAt(j, c);
                        String word = sb.toString();
                        if (word.equals(end))
                            return ans;
                        if (bankSet.contains(word)) {
                            bankSet.remove(word);
                            q.offer(word);
                        }
                    }
                    sb.setCharAt(j, cache);
                }
            }
        }

        return -1;
    }
}
