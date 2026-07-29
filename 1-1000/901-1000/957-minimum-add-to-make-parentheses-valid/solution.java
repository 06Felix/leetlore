class Solution {
    public int minAddToMakeValid(String s) {
        int l = 0, r = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(')
                l++;
            else{
                if(l == 0)
                    r++;
                else
                    l--;
            }
        }
        return l + r;
    }
}
