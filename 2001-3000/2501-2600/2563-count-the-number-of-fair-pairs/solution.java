class Solution {
    private long upto(int[] arr, int k){
        long ans = 0;
        int l = 0, r = arr.length - 1;
        while(l < r){
            while(l < r && arr[l] + arr[r] > k)
                r--;
            ans += r - l;
            l++;
        }
        return ans;
    }
    public long countFairPairs(int[] arr, int lower, int upper) {
        Arrays.sort(arr);
        return upto(arr, upper) - upto(arr, lower - 1);
    }
}
