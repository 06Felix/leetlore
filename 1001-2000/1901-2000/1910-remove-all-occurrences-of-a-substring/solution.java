class Solution {
    public String removeOccurrences(String s, String part) {
        int idx = s.indexOf(part);
        int l = part.length();
        while(idx >= 0){
            s = s.substring(0, idx) + s.substring(idx + l);
            idx = s.indexOf(part);
        }
        return s;
    }
}
