class Solution {
    public String answerString(String word, int numFriends) {
        if (numFriends == 1)
            return word;
        char[] arr = word.toCharArray();
        int n = arr.length;
        int len = n - numFriends;
        char mx = 'a';
        for (char ch : arr)
            if (ch > mx)
                mx = ch;
        String ans = "a".repeat(len);
        for (int i = 0; i < n; i++) {
            char ch = arr[i];
            if (mx == ch) {
                String cont = word.substring(i, Math.min(i + len + 1, n));
                if (ans.compareTo(cont) < 0)
                    ans = cont;
            }
        }
        return ans;
    }
}
