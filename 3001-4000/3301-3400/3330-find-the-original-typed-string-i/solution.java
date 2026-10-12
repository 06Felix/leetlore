class Solution {
    public int possibleStringCount(String word) {
        char[] arr = word.toCharArray();
        int n = arr.length;
        int i = 0;
        int ct = 0;
        int ans = 0;
        while(i < n){
            int j = i + 1;
            while(j < n && arr[j] == arr[i]){
                j++;
                ct++;
            }
            ans += ct;
            i = j;
            ct = 0;
        }
        return ans + 1;
    }
}
