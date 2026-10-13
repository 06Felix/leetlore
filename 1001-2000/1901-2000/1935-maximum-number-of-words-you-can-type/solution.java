class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        boolean[] isBroken = new boolean[26];
        for (char ch : brokenLetters.toCharArray())
            isBroken[ch - 'a'] = true;
        int ans = 0;
        words: for (String word : text.split(" ")) {
            letters: for (char ch : word.toCharArray())
                if (isBroken[ch - 'a'])
                    continue words;
            ans++;
        }
        return ans;
    }
}
