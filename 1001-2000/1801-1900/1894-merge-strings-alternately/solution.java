class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int i = 0,j = 0;
        int n = word1.length();
        int m = word2.length();
        while(i < n || j < m){
            if(i < n)
                ans += word1.charAt(i++);
            if(j < m)
                ans += word2.charAt(j++);
        }
        return ans;
    }
}
