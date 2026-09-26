class Solution {
    private String str;
    private int idx;

    public List<String> braceExpansionII(String expression) {
        str = expression;
        idx = 0;

        return new ArrayList<>(expr());
    }

    private TreeSet<String> expr() {
        TreeSet<String> ans = term();

        while (idx < str.length() && str.charAt(idx) == ',') {
            ++idx;
            ans.addAll(term());
        }

        return ans;
    }

    private TreeSet<String> term() {
        TreeSet<String> ans = new TreeSet<>();
        ans.add("");

        while (idx < str.length() && str.charAt(idx) != '}' && str.charAt(idx) != ',')
            ans = prod(ans, part());

        return ans;
    }

    private TreeSet<String> part() {
        TreeSet<String> ans = new TreeSet<>();

        if (str.charAt(idx) == '{') {
            ++idx;
            ans = expr();
            ++idx;
            return ans;
        }

        int start = idx;

        while (idx < str.length() && str.charAt(idx) >= 'a' && str.charAt(idx) <= 'z')
            ++idx;

        ans.add(str.substring(start, idx));
        return ans;
    }

    private TreeSet<String> prod(TreeSet<String> left, TreeSet<String> right) {
        TreeSet<String> ans = new TreeSet<>();

        for (String a : left)
            for (String b : right)
                ans.add(a + b);

        return ans;
    }
}
