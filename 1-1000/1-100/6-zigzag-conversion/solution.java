class Solution {
    public String convert(String s, int numRows) {
        StringBuilder ans = new StringBuilder();
        StringBuilder[] rows = new StringBuilder[numRows];
        int k = 0;
        int dir = numRows == 1 ? 0 : -1;

        for (int i = 0; i < numRows; ++i)
            rows[i] = new StringBuilder();

        for (char c : s.toCharArray()) {
            rows[k].append(c);
            if (k == 0 || k == numRows - 1)
                dir *= -1;
            k += dir;
        }

        for (StringBuilder row : rows)
            ans.append(row);

        return ans.toString();
    }
}
