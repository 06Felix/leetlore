public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        char[] arr1 = s1.toCharArray(), arr2 = s2.toCharArray();
        int l1 = arr1.length, l2 = arr2.length;
        int ct1 = 0, ct2 = 0, i = 0, j = 0;
        while (ct1 < n1) {
            if (arr1[i++] == arr2[j]) {
                if (++j == l2) {
                    j = 0;
                    ct2++;
                }
            }
            if (i == l1) {
                i = 0;
                ct1++;
            }
        }
        return ct2 / n2;
    }
}
