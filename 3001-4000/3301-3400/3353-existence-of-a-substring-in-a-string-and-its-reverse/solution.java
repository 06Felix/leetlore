class Solution {
    public boolean isSubstringPresent(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int n = s.length();
        for(int i = 0 ;i<n-1;i++){
            if(rev.indexOf(s.substring(i,i+2)) >= 0)
                return true;
        }
        return false;
    }
}
