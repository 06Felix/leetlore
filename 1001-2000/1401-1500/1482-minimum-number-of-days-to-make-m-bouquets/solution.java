class Solution {
    public int minDays(int[] arr, int m, int k) {
        if((long)m * k > arr.length)
            return -1;
        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for(int d : arr){
            l = Math.min(l, d);
            r = Math.max(r, d);
        }
        while(l < r){
            int md = (l + r) / 2;
            if(count(arr, k, md) >= m)
                r = md;
            else
                l = md + 1;
        }
        return l;
    }

    private int count(int[] arr, int k, int w){
        int ct = 0;
        int r = k;
        for(int d : arr){
            if(d > w)
                r = k;
            else if(--r == 0){
                ct++;
                r = k;
            }
        }
        return ct;
    }
}
