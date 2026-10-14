class Solution {
    public String simplifyPath(String path) {
        path += "/";
        Deque<String> st = new ArrayDeque<>();
        int prv = 1;
        int idx = path.indexOf("/", prv);
        while (idx >= 0) {
            String cur = path.substring(prv, idx);
            if (cur.equals(".."))
                st.pollLast();
            else if (!cur.isBlank() && !cur.equals("."))
                st.offer(cur);
            prv = idx + 1;
            idx = path.indexOf("/", prv);
        }
        if (st.isEmpty())
            return "/";
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
            ans.append("/").append(st.poll());
        return ans.toString();
    }
}
