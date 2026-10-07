class Solution {
    private Map<String, Integer> getFrequencyMap(String str, int len) {
        Map<String, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < str.length(); i += len) {
            String sub = str.substring(i, i + len);
            freqMap.put(sub, freqMap.getOrDefault(sub, 0) + 1);
        }
        return freqMap;
    }

    public boolean isPossibleToRearrange(String s, String t, int k) {
        int n = s.length();
        int len = n / k;
        Map<String, Integer> sFreqMap = getFrequencyMap(s, len);
        Map<String, Integer> tFreqMap = getFrequencyMap(t, len);
        return sFreqMap.equals(tFreqMap);
    }
}
