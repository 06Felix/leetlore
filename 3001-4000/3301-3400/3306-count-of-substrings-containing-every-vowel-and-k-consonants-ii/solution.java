class Solution {
    private boolean checkVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public long atLeastK(char[] word, int k, int n) {
        int[] seen = new int[26];
        int vow = 0, con = 0;
        long ans = 0;
        for (int l = 0, r = 0; r < n; r++) {
            char c = word[r];
            if (checkVowel(c)) {
                if (seen[c - 'a']++ == 0)
                    vow++;
            }
            else
                con++;

            while (con >= k && vow == 5) {
                ans += n - r;
                char lC = word[l];
                if (checkVowel(lC)) {
                    if (--seen[lC - 'a'] == 0)
                        vow--;
                }
                else
                    con--;
                l++;
            }
        }
        return ans;
    }

    public long countOfSubstrings(String word, int k) {
        char[] arr = word.toCharArray();
        int n = arr.length;
        return atLeastK(arr, k, n) - atLeastK(arr, k + 1, n);
    }
}
