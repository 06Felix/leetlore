class Solution {
    private int convert(char[] arr, int[] nge, int n){
        for(int i = 0 ; i < n ; i++)
            if(nge[i] > i){
                char t = arr[i];
                arr[i] = arr[nge[i]];
                arr[nge[i]] = t;
                break;
            }
        int ans = 0;
        for(char ch : arr)
            ans = (10 * ans) + (ch - '0'); 
        return ans;
    }
    public int maximumSwap(int num) {
        char[] arr = Integer.toString(num).toCharArray();
        int n = arr.length;
        int[] nge = new int[n];
        int mx = Integer.MIN_VALUE, mi = n - 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            int cur = arr[i] - '0';
            if(cur < mx)
                nge[i] = mi;
            if(cur > mx){
                mx = cur;
                mi = i;
            }
        }
        return convert(arr, nge, n);
    }
}
