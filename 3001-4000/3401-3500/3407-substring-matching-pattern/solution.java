class Solution {
    public boolean hasMatch(String s, String p) {
        int st_i = p.indexOf("*");
        String left = p.substring(0, st_i);
        String right = p.substring(st_i + 1);
        int li = s.indexOf(left);
        if(li < 0)
            return false;
        int ri = s.indexOf(right, li + left.length());
        return ri >= 0; 
    }
}
