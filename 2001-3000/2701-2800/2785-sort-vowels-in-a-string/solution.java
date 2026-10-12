class Solution {
    public String sortVowels(String s) {
        char[] str = s.toCharArray();
        int n = str.length;
        Map<Character, Integer> vowels = new HashMap<>();
        for (char v : "AEIOUaeiou".toCharArray())
            vowels.put(v, 0);
        for (char c : str)
            if (vowels.containsKey(c))
                vowels.put(c, vowels.get(c) + 1);
        char[] keys = {'A','E','I','O','U','a','e','i','o','u'};
        int k = 0;
        char[] ans = new char[n];
        for (int i = 0; i < n; i++) {
            char c = str[i];
            if (vowels.containsKey(c)) {
                while (vowels.get(keys[k]) == 0)
                    k++;
                ans[i] = keys[k];
                vowels.put(keys[k], vowels.get(keys[k]) - 1);
            }
            else
                ans[i] = c;
        }
        return new String(ans);
    }
}
