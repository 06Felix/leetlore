class Solution {
    public boolean checkRecord(String s) {
        int cA = 0;
        int cL = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'A')
                cA++;
            else if(ch == 'L')
                cL++;
            if(cA == 2 || cL == 3)
                return false;
            if(ch != 'L')
                cL = 0;
        }
        return true;
    }
}
