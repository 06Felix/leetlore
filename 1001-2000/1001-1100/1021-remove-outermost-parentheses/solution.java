class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int cur = 0;
        for (char c : s.toCharArray())
            if (c == '(') {
                if (++cur > 1)
                    ans.append(c);
            }
            else if (--cur > 0)
                ans.append(c);
        return ans.toString();
    }
}
