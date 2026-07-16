class Solution {
    public int balancedString(String s) {
        char[] arr = s.toCharArray();
        int len = s.length();
        int[] freq = new int[26];
        for(char c:arr) freq[c-'A']++;

        int l=0, r=0, count=0, res=Integer.MAX_VALUE;

        while(r<len){
            freq[arr[r]-'A']--;
            r++;

            while(l<len && freq['Q'-'A']<=len/4 && freq['W'-'A']<=len/4 && freq['E'-'A']<=len/4 && freq['R'-'A']<=len/4){
                res = Math.min(res, r-l);
                freq[arr[l]-'A']++;
                l++;
            }
        }
        return res;
    }
}
