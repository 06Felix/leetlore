class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] sieve = new boolean[right + 1];
        int[] ans = {-1, -1};
        int pp = -1;
        int mnDif = Integer.MAX_VALUE;
        for(int i = 2; i <= right ; i++){
            if(sieve[i])
                continue;
            if(i >= left && pp != -1 && i - pp < mnDif){
                mnDif = i - pp;
                ans[0] = pp;
                ans[1] = i;
            }
            if(i >= left)
                pp = i;
            for(int j = i; j <= right ; j += i)
                sieve[j] = true;
        }
        return ans;
    }
}
