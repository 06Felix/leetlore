class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        char t1 = '{', t2 = '}';
        for(int i = 0 ; i < n ; i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if(c1 != c2){
                if(t1 == '{'){
                    t2 = c1;
                    t1 = c2;
                }
                else if(t1 == c1 && t2 == c2){
                    t1 = '[';
                }
                else
                    return false;
            }
        }
        return t1 == '[' || t1 == '{';
    }
}
