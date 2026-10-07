class Solution {
    public int takeCharacters(String s, int k) {
        int[] ct = new int[3];
        char[] arr = s.toCharArray();
        for(char ch : arr)
            ct[ch - 'a']++;
        if(ct[0] < k || ct[1] < k || ct[2] < k)
            return -1;
        int n = s.length();
        int ans = n;
        for(int l = 0, r = 0 ; r < n ; r++){
            ct[arr[r] - 'a']--;
            while(ct[arr[r] - 'a'] < k)
                ct[arr[l++] - 'a']++;
            ans = Math.min(ans, n - (r - l + 1));
        }
        return ans;
    }
}
