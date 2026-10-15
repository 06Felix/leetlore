class Solution {
    private int count(String str) {
        int ct = 0;
        for (char ch : str.toCharArray())
            if (ch == '1')
                ct++;
        return ct;
    }
    public int numberOfBeams(String[] bank) {
        int prv = count(bank[0]);
        int ans = 0;
        int m = bank.length;
        for (int i = 1; i < m; i++) {
            int nxt = count(bank[i]);
            if (nxt != 0) {
                ans += (nxt * prv);
                prv = nxt;
            }
        }
        return ans;
    }
}
