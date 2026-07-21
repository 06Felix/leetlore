class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int l = 0, r = s.length();
        for(int i = 0 ; i < s.length() ; i++)
            if(s.charAt(i) == 'I')
                ans[i] = l++;
            else
                ans[i] = r--;
        ans[s.length()] = r;
        return ans;
    }
}
