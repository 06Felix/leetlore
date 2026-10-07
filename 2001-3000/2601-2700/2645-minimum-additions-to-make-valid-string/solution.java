class Solution {
    public int addMinimum(String word) {
        char[] let = new char[]{'a', 'b', 'c'};
        int i = 0, n = word.length(), ans = 0;
        while(i < n){
            for(char c : let){
                if(i < word.length() && word.charAt(i) == c)
                    i++;
                else
                    ans++;
            }
        }
        return ans;
    }
}
