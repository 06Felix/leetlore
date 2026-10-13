class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" ");
        StringBuilder ans = new StringBuilder();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            String t = arr[l];
            arr[l++] = arr[r];
            arr[r--] = t;
        }
        for (String x : arr)
            if(!x.isBlank())
                ans.append(x).append(" ");
        return ans.toString().trim();
    }
}
