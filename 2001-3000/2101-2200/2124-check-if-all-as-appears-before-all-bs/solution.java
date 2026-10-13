class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        int aInd = rev.indexOf('a');
        int bInd = s.indexOf('b');
        if (aInd < 0 || bInd < 0)
            return true;
        return bInd >= n - aInd;
    }
}
