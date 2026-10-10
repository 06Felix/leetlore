class Solution {
    public int countOfSubstrings(String word, int k) {
        Set<Character> vowels = new HashSet<>();
        int n = word.length();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        int count = 0;
        for (int i = 0; i < n; i++) {
            int consonantCount = 0;
            Set<Character> seenVowels = new HashSet<>();
            for (int j = i; j < n; j++) {
                char c = word.charAt(j);
                if (vowels.contains(c))
                    seenVowels.add(c);
                else
                    consonantCount++;
                if (seenVowels.size() == 5 && consonantCount == k)
                    count++;
            }
        }
        return count;
    }
}
