class Solution {
    private String vowels = "aeiou";
    private int check(String str){
        if(vowels.indexOf(str.charAt(0)) >= 0 && vowels.indexOf(str.charAt(str.length() - 1)) >= 0)
            return 1;
        return 0;
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prf = new int[n + 1];
        for(int i = 0 ; i < n ; i++)
            prf[i + 1] = prf[i] + check(words[i]);
        int[] ans = new int[queries.length];
        int i = 0;
        for(int[] q : queries)
            ans[i++] = prf[q[1] + 1] - prf[q[0]];
        return ans;
    }
}
