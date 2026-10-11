class Solution {
    public int countSubarrays(int[] arr) {
        int l = 0, r = 2;
        int n = arr.length;
        int ans = 0;
        while(r < n)
            if((arr[l++] + arr[r]) * 2 == arr[r++ - 1])
                ans++;
        return ans;
    }
}
