class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int l = 1;
        int r = 1;
        for(int x : quantities)
            r = Math.max(r, x);
        while(l < r){
            int m = (l + r) / 2;
            if(find(quantities, m, n))
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
    public boolean find(int[] arr, int k, int n){
        int ans = 0;
        for(int x : arr){
            ans += (x - 1) / k + 1;
            if(ans > n)
                return false;
        }
        return true;
    }
}
