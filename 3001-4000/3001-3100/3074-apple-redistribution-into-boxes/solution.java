class Solution {
    public int minimumBoxes(int[] ap, int[] cap) {
        int as = 0;
        for (int a : ap)
            as += a;
        Arrays.sort(cap);
        int ans = 0;
        int i = cap.length - 1;
        while (as > 0) {
            as -= cap[i--];
            ans++;
        }
        return ans;
    }
}
