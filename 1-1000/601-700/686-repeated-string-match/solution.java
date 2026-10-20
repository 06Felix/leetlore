class Solution {
    public int repeatedStringMatch(String a, String b) {
        int n = (int) Math.ceil((double) b.length() / (double) a.length());
        String s = String.join("", Collections.nCopies(n, a));
        if (s.contains(b))
            return n;
        if ((s + a).contains(b))
            return n + 1;
        return -1;
    }
}
