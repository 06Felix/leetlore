class Solution {
    public int maxDistance(String s, int k) {
        char[] str = s.toCharArray();
        return Math.max(Math.max(flip(str, k, "NE"), flip(str, k, "NW")),
                        Math.max(flip(str, k, "SE"), flip(str, k, "SW")));
    }

    private int flip(char[] str, int k, String direction) {
        int res = 0;
        int pos = 0;
        int opposite = 0;
        for (char c : str) {
            if (direction.indexOf(c) >= 0)
                ++pos; 
            else {
                --pos;
                ++opposite;
            }
            res = Math.max(res, pos + 2 * Math.min(k, opposite));
        }
        return res;
    }
}
