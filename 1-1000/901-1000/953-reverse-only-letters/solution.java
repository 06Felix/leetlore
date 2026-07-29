class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0, r = s.length() - 1;
        while(l < r){
            while(l < r && !Character.isAlphabetic(s.charAt(l)))
                l++;
            while(l < r && !Character.isAlphabetic(s.charAt(r)))
                r--;
            swap(sb, l, r);
            l++;
            r--;
        }
        return sb.toString();
    }
    private void swap(StringBuilder sb, int l, int r){
        char ch = sb.charAt(l);
        sb.setCharAt(l, sb.charAt(r));
        sb.setCharAt(r, ch);
    }
}
