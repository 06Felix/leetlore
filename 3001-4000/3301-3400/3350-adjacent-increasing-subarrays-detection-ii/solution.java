class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int[] arr = new int[n];
        int id = 0;
        for(int x : nums)
            arr[id++] = x;
        int i = 0;
        int ans = 1, prevCt = 1;
        while(i < n){
            int ct = 1, j = i + 1;
            while(j < n && arr[j] > arr[j - 1]) {
                ct++;
                j++;
            }
            ans = Math.max(ans, ct / 2);
            ans = Math.max(ans, Math.min(prevCt, ct));
            prevCt = ct;
            i = j;
        }
        return ans;
    }
}
