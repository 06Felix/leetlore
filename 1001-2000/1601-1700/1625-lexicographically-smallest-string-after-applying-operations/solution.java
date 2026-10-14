class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        String ans = s;
        Deque<String> q = new ArrayDeque<>();
        q.offer(s);
        Set<String> seen = new HashSet<>();
        seen.add(s);
        while (!q.isEmpty()) {
            String cur = q.poll();
            if (cur.compareTo(ans) < 0)
                ans = cur;
            StringBuilder sb = new StringBuilder(cur);
            int l = sb.length();
            for (int i = 1; i < l; i += 2)
                sb.setCharAt(i, (char) ((sb.charAt(i) - '0' + a) % 10 + '0'));
            String added = sb.toString();
            if (seen.add(added))
                q.offer(added);
            String rotated = cur.substring(cur.length() - b) + cur.substring(0, cur.length() - b);
            if (seen.add(rotated))
                q.offer(rotated);
        }
        return ans;
    }
}
