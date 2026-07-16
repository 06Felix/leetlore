class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        int l = 0, r = len - 1;
        char[] arr = s.toCharArray();
        while(l < r && arr[l] == arr[r]){
            char ch = arr[l];
            while(l <= r && arr[l] == ch){
                l++;
                len--;
            }
            while(l < r && arr[r] == ch){
                r--;
                len--;
            }
        }
        return len;
    }
}
