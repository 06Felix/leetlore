class Solution {
    public String clearStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        char[] str = s.toCharArray();
        int n = str.length;
        List<Integer>[] arr = new List[26];
        for (int i = 0; i < 26; ++i)
            arr[i] = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (str[i] == '*') {
                sb.setCharAt(i, ' ');
                int j = 0;
                while (arr[j].isEmpty())
                    j++;
                sb.setCharAt(arr[j].remove(arr[j].size() - 1), ' ');
            }
            else
                arr[str[i] - 'a'].add(i);
        return sb.toString().replaceAll(" ", "");
    }
}
