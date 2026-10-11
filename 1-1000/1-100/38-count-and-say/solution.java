class Solution {
    public String countAndSay(int num) {
        StringBuilder ans = new StringBuilder("1");
        while (--num > 0) {
            StringBuilder nx = new StringBuilder();
            int n = ans.length();
            for (int i = 0; i < n; ++i) {
                int ct = 1;
                while (i + 1 < n && ans.charAt(i) == ans.charAt(i + 1)) {
                    ct++;
                    i++;
                }
                nx.append(ct).append(ans.charAt(i));
            }
            ans = nx;
        }
        return ans.toString();
    }
}
