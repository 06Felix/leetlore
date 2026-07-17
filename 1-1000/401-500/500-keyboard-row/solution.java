class Solution {
    private boolean check(String str,String pat){
        for(char ch : str.toCharArray()){
            if(pat.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
    public String[] findWords(String[] words) {
        ArrayList<String> l = new ArrayList<>();
        String s1 = "qwertyuiop";
        String s2 = "asdfghjkl";
        String s3 = "zxcvbnm";
        for(String word : words){
            String t = word.toLowerCase();
            if(check(t,s1) || check(t,s2) || check(t,s3))
                l.add(word);
        }
        String[] ans = new String[l.size()];
        for(int i=0;i<l.size();i++)
            ans[i] = l.get(i);
        return ans;
    }
}
