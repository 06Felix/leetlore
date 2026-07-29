class Solution {
    private int ans = 0;
    public int countRangeSum(int[] nums, int low, int up) {
        int n = nums.length;
        long[] prefix = new long[n + 1];
        for(int i = 0 ; i < n ; i++)
            prefix[i + 1] = nums[i] + prefix[i];
        sort(prefix, 0, n, low, up);
        return ans;
    }
    private void sort(long[] arr, int l, int r, int low, int up){
        if(l < r){
            int m = (l + r) / 2;
            sort(arr, l, m, low, up);
            sort(arr, m + 1, r, low, up);
            merge(arr, l, m, r, low, up);
        }
    }
    private void merge(long[] arr, int l, int m, int r, int low, int up){
        int l1 = m + 1, r1 = m + 1;
        for(int i = l ; i <= m ; i++){
            while(l1 <= r && arr[l1] - arr[i] < low)
                l1++;
            while(r1 <= r && arr[r1] - arr[i] <= up)
                r1++;
            ans += r1 - l1;
        }
        int i = l, j = m + 1, k = 0;
        long[] t = new long[r - l + 1];
        while(i <= m && j <= r){
            if(arr[i] > arr[j])
                t[k++] = arr[j++];
            else
                t[k++] = arr[i++];
        }
        while(i <= m)
            t[k++] = arr[i++];
        while(j <= r)
            t[k++] = arr[j++];
        int id = l;
        for(long x : t)
            arr[l++] = x;
    }
}
