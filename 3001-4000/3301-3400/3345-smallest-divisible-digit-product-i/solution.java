class Solution {
    private int pod(int n){
        int ans = 1;
        while(n > 0){
            ans *= n % 10;
            n /= 10;
        }
        return ans;
    }
    public int smallestNumber(int n, int t) {
        for(int i = n ; ; i++)
            if(pod(i) % t == 0)
                return i;
        // return 0;
    }
}
