class Solution {
    public String baseNeg2(int n) {
        StringBuilder ans = new StringBuilder();
        while(n != 0){
            ans.append(n & 1);
            n = -(n >> 1);
        }
        return ans.length() > 0 ? ans.reverse().toString() : "0";
    }
}
