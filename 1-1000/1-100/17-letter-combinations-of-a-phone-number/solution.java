class Solution {
    private static Map<Character, char[]> map = new HashMap<>();
    static {
        map.put('2', "abc".toCharArray());
        map.put('3', "def".toCharArray());
        map.put('4', "ghi".toCharArray());
        map.put('5', "jkl".toCharArray());
        map.put('6', "mno".toCharArray());
        map.put('7', "pqrs".toCharArray());
        map.put('8', "tuv".toCharArray());
        map.put('9', "wxyz".toCharArray());
    }
    private char[] digits;
    private List<String> ans = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if (digits.isBlank())
            return ans;
        this.digits = digits.toCharArray();
        find(0, digits.length(), new StringBuilder());
        return ans;
    }
    private void find(int i, int n, StringBuilder str) {
        if (i == n) {
            ans.add(new StringBuilder(str).toString());
            return;
        }
        for (char ch : map.get(digits[i])) {
            str.append(ch);
            find(i + 1, n, str);
            str.deleteCharAt(i);
        }
    }
}
