class Solution {
    public long validSubstringCount(String word1, String word2) {
        int[] word2Freq = new int[26];
        for (char c : word2.toCharArray())
            word2Freq[c - 'a']++;
        
        long count = 0;
        int n = word1.length();
        int[] windowFreq = new int[26];
        int left = 0;

        for (int right = 0; right < n; right++) {
            windowFreq[word1.charAt(right) - 'a']++;

            while (isValidPrefix(windowFreq, word2Freq)) {
                count += (n - right);
                windowFreq[word1.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }

    private boolean isValidPrefix(int[] windowFreq, int[] word2Freq) {
        for (int i = 0; i < 26; i++) {
            if (windowFreq[i] < word2Freq[i]) {
                return false;
            }
        }
        return true;
    }
}
