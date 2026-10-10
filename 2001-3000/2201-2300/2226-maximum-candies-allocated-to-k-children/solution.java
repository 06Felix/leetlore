class Solution {
    public int maximumCandies(int[] candies, long k) {
        long sum = 0;
        int n = candies.length;
        for(int c : candies)
            sum += c;
        if(sum <= k)
            return (int) (sum / k);
        long l = 1, r = sum / k;
        long ans = 0;
        while(l <= r) {
            long m = (l + r) / 2;
            if(find(candies, m) >= k){
                ans = m;
                l = m + 1;
            }
            else
                r = m - 1;
        }
        return (int) ans;
    }
    private long find(int[] arr, long k){
        long ans = 0;
        for(int x : arr)
            ans += x / k;
        return ans;
    }
}
