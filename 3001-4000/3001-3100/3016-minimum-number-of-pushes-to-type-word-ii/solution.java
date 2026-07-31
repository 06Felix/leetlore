class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int[] ct = new int[26];

        for (char ch : word.toCharArray())
            ct[ch - 'a']++;
        Arrays.sort(ct);

        for (int i = 0; i < 26; i++) {
            if (ct[26 - i - 1] == 0)
                break;
            ans += ct[26 - i - 1] * (i / 8 + 1);
        }
        
        return ans;
    }
}
