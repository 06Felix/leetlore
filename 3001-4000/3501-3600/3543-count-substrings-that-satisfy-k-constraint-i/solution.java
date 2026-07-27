class Solution {
    public int countKConstraintSubstrings(String s, int k) {
    int n = s.length();
    int start_0 = 0, start_1 = 0;
    int count_0 = 0, count_1 = 0;
    int result = 0;

    for (int end = 0; end < n; end++) {
        if (s.charAt(end) == '0') {
            count_0++;
        } else {
            count_1++;
        }

        while (count_0 > k) {
            if (s.charAt(start_0) == '0') {
                count_0--;
            }
            start_0++;
        }

        while (count_1 > k) {
            if (s.charAt(start_1) == '1') {
                count_1--;
            }
            start_1++;
        }

        result += (end - start_0 + 1) + (end - start_1 + 1) - (end - Math.max(start_0, start_1) + 1);
    }

    return result;
}

}
