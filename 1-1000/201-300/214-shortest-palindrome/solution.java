class Solution {
    public String shortestPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (right >= 0) {
            if (s.charAt(left) == s.charAt(right))
                left++;
            right--;
        }
        if (left == s.length())
            return s;
        String suffix = s.substring(left);
        StringBuilder sb = new StringBuilder();
        return new StringBuilder().append(suffix).reverse()
                .append(shortestPalindrome(s.substring(0, left))).append(suffix).toString();

    }
}
