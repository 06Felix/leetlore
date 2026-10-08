class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
        int n = arr.length;
        long a1 = 0;
        long a2 = k;
        for (int i = 0; i < n; i++) {
            a1 += Math.abs(arr[i] - brr[i]);
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        long a3 = 0;
        for (int i = 0; i < n; i++)
            a3 += Math.abs(arr[i] - brr[i]);
        a2 += a3;
        return Math.min(a1, a2);
    }
}
