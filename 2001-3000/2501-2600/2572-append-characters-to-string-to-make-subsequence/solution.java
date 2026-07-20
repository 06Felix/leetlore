class Solution{
    public int appendCharacters(String s, String t){
        char[] a1 = s.toCharArray();
        int i = 0, j = 0;
        while(i < a1.length && j < t.length()){
            if(t.charAt(j) == a1[i])
                j++;
            i++;
        }
        return t.length() - j;
    }
}
