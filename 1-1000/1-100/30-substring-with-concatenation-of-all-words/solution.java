class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        int n = words.length;
        if (n == 0)
            return new ArrayList<>();
        int wordLength = words[0].length();
        if (n * wordLength > s.length())
            return new ArrayList<>();
        Map<String, Integer> targetCounts = new HashMap<>();
        for (int i = 0; i < n; i++)
            targetCounts.put(words[i], targetCounts.getOrDefault(words[i], 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < wordLength; i++) {
            Map<String, Integer> windowCounts = new HashMap<>();
            int totalWords = 0;
            int left = i, right = i + wordLength;
            while (right <= s.length()) {
                String cur = s.substring(right - wordLength, right);
                if (targetCounts.containsKey(cur)) {
                    windowCounts.put(cur, windowCounts.getOrDefault(cur, 0) + 1);
                    totalWords++;
                    while (targetCounts.get(cur) < windowCounts.get(cur)) {
                        String tmp = s.substring(left, left + wordLength);
                        windowCounts.put(tmp, windowCounts.get(tmp) - 1);
                        left += wordLength;
                        totalWords--;
                    }
                    if (totalWords == n)
                        result.add(left);

                } else {
                    windowCounts = new HashMap<>();
                    left = right;
                    if (left > s.length() - n * wordLength)
                        break;
                    totalWords = 0;
                }
                right += wordLength;
            }
        }
        return result;
    }
}
