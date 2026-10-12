class Solution {
    public String largestGoodInteger(String num) {
        char[] str = num.toCharArray();
        int n = str.length;
        int ans = -1;
        for (int i = 1; i < n - 1; i++)
            if (str[i - 1] == str[i] && str[i + 1] == str[i])
                if (str[i++] - '0' > ans)
                    ans = str[i++] - '0';
        return ans == -1 ? "" : String.valueOf(ans).repeat(3);
    }
}
