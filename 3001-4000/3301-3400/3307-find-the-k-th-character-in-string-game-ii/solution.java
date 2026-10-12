class Solution {
    public char kthCharacter(long k, int[] operations) {
        int ct = (int) Math.ceil(Math.log(k) / Math.log(2));
        int inc = 0;
        for (int i = ct - 1; i >= 0; --i) {
            long half = 1L << i;
            if (k > half) {
                k -= half;
                inc += operations[i];
            }
        }
        return (char) ('a' + inc % 26);
    }
}
