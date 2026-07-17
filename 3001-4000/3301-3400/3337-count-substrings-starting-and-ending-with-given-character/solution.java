class Solution {
    public long countSubstrings(String s, char c) {
        char[] arr = s.toCharArray();
        int l = arr.length;
        long ans = 0;
        int cCount = 0;
        
        for (char ch : arr) {
            if (ch == c) {
                cCount++;
            }
        }
        
        for (int i = 0; i < l; i++) {
            if (arr[i] == c) {
                ans += cCount;
                cCount--;
            }
        }
        
        return ans;
    }
}
