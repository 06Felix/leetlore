class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int l = 0, r = 0;
        int count = 0, ans = 101;
        char[] arr = blocks.toCharArray();
        while(r < n) {
            char c = arr[r];
            if(c == 'W') {
                count++;
            }
            if(r - l == k - 1) {
                ans = Math.min(ans, count);
                if(arr[l] == 'W')
                    count = count - 1;
                l++;
            }
            r++;
        }
        return ans;
    }
}
