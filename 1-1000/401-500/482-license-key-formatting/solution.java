class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toUpperCase().toCharArray();
        int n = arr.length;
        int ct = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (arr[i] == '-')
                continue;
            sb.append(arr[i]);
            ct++;
            if (ct % k == 0)
                sb.append('-');
        }
        sb.reverse();
        if (sb.length() > 0 && sb.charAt(0) == '-')
            sb.deleteCharAt(0);
        return sb.toString().trim();
    }
}
