class Solution {
    public int countOperations(int n1, int n2) {
        int ans = 0;
        while (n1 > 0 && n2 > 0) {
            ans += n1 / n2;
            n1 %= n2;
            int t = n1;
            n1 = n2;
            n2 = t;
        }
        return ans;
    }
}
