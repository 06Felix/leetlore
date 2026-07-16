class Solution {
    public String firstPalindrome(String[] words) {
        for(String x : words)
            if(isP(x))
                return x;
        return "";
    }
    private boolean isP(String str){
        int l = 0;
        int r = str.length() - 1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
