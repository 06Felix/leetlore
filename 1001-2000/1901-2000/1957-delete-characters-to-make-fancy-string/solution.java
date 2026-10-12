class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        char[] str = s.toCharArray();
        int n = str.length;
        for(int i = 0 ; i < n ; i++){
            if(i > 1 && str[i] == str[i - 1] && str[i] == str[i - 2])
                continue;
            sb.append(str[i]);
        }
        return sb.toString();
    }
}
