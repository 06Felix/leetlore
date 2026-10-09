class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int cur = 1, i = 1;
        int n = s.length();
        char[] arr = s.toCharArray();
        while(i < n){
            if(arr[i] != arr[i - 1]){
                if(cur == k)
                    return true;
                cur = 1;
            }
            else
                cur++;
            i++;
        }
        return cur == k;
    }
}
