class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int n : arr)
            sum += n;
        if(sum % 3 != 0)
            return false;
        int ct = 0;
        int cs = 0;
        for(int n : arr){
            cs += n;
            if(cs == sum / 3){
                ct++;
                cs = 0;
            }
        }
        return ct >= 3;
    }
}
