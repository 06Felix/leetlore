class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0;
        int mx = -1;
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            mx = Math.max(mx, arr[i]);
            if(mx == i)
                ans++;
        }
        return ans;
    }
}
