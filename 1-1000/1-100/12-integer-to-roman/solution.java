class Solution {
    public String intToRoman(int num) {
        final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V",  "IV", "I"};
        int n = values.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; num > 0 && i < n; i++)
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        return sb.toString();
    }
}
