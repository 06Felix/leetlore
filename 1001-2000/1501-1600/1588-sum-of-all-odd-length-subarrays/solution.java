class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int cur = 0;
            for(int j = i ; j < n ; j++){
                cur += arr[j];
                if((i + j) % 2 == 0)
                    ans += cur;
            }
        }
        return ans;
    }
}
