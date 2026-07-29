class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = Integer.MIN_VALUE;
        int r = 0; 
        for(int w : weights){
            r += w;
            l = Math.max(l, w);
        }
        while(l < r){
            int m = (l + r) / 2;
            if(safe(weights, m, days))
                r = m;
            else
                l = m + 1;
        }
        return r;
    }
    private boolean safe(int[] arr, int w, int req){
        int ct = 1, sum = 0;
        for(int x : arr){
            sum += x;
            if(sum > w){
                ct++;
                sum = x;
            }
        }
        return ct <= req;
    }
}
