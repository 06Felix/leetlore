class Solution {
    private boolean check(StringBuilder sb, int[] ct) {
        for (int i = 25; i >= 0; --i)
            if (ct[i] > 0)
                return sb.charAt(sb.length() - 1) == 'a' + i;
        return false;
    }
    private int getChar(StringBuilder sb, int[] ct) {
        for (int i = 25; i >= 0; --i)
            if (ct[i] > 0 && (sb.isEmpty() || sb.charAt(sb.length() - 1) != 'a' + i))
                return i;
        return -1;
    }
    public String repeatLimitedString(String s, int repeatLimit) {
        StringBuilder sb = new StringBuilder();
        int[] ct = new int[26];
        for (char c : s.toCharArray())
            ++ct[c - 'a'];
        while (true) {
            int i = getChar(sb, ct);
            if (i == -1)
                break;
            boolean add = !sb.isEmpty() && check(sb, ct);
            int rep = add ? 1 : Math.min(ct[i], repeatLimit);
            sb.append(String.valueOf((char) ('a' + i)).repeat(rep));
            ct[i] -= rep;
        }
        return sb.toString();
    }
}
