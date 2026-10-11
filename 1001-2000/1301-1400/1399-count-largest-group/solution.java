class Solution {
    int sod(int n) {
        int ans = 0;
        while(n > 0) {
            ans += n % 10;
            n /= 10;
        }
        return ans;
    }
    public int countLargestGroup(int n) {
        Map<Integer, Integer> ct = new HashMap<>();
        int mx = 0;
        for(int i = 1; i <= n; i++) {
            int sum = sod(i);
            ct.merge(sum, 1, Integer :: sum);
            mx = Math.max(mx, ct.get(sum));
        }
        int ans = 0;
        for(int i : ct.keySet())
            if(ct.get(i) == mx)
                ans++;
        return ans;        
    }
}
