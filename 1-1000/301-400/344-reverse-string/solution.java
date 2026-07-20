class Solution {
    private void swap(char[] s,int i,int j){
        char ch = s[i];
        s[i] = s[j];
        s[j] = ch;
    }
    public void reverseString(char[] s) {
        int l = 0,r = s.length - 1;
        while(l < r)
            swap(s,l++,r--);
    }
}
