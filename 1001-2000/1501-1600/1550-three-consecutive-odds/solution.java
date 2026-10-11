class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int ct = 0;
        for(int n : arr){
            if((n & 1) == 1)
                ct++;
            else
                ct = 0;
            if(ct == 3)
                return true;
        }
        return false;
    }
}
