class Solution {
    public boolean checkZeroOnes(String s) {
        int c1 = 0, c0 = 0;
        int m1 = 0, m0 = 0;
        for(char c : s.toCharArray()){
            if(c == '0'){
                c0++;
                m1 = Math.max(m1, c1);
                c1 = 0;
            }
            else{
                c1++;
                m0 = Math.max(m0, c0);
                c0 = 0;
            }
        }
        m1 = Math.max(m1, c1);
        m0 = Math.max(m0, c0);
        return m1 > m0;
    }
}
