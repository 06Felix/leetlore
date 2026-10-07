class Solution {
    public int[] decode(int[] arr, int first) {
        int n = arr.length;
        int[] ans = new int[n + 1];
        ans[0] = first;
        for(int i = 1 ; i <= n ; i++)
            ans[i] = ans[i - 1] ^ arr[i - 1];
        return ans;
    }
}
