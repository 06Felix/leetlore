class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        char[] arr = s.toCharArray();
        int n = s.length();
        int p = -n;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == c)
                p = i;
            ans[i] = i - p;
        }
        for(int i = p - 1 ; i >= 0 ; i--){
            if(arr[i] == c)
                p = i;
            ans[i] = Math.min(ans[i], p - i);
        }
        return ans;
    }
}
