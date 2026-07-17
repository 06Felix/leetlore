class Solution {
    public int thirdMax(int[] nums) {
        long a = Long.MIN_VALUE;
        long b = Long.MIN_VALUE;
        long c = Long.MIN_VALUE;
        for(int x : nums){
            if(x > a){
                c = b;
                b = a;
                a = x;
            }
            else if(x > b && x != a){
                c = b;
                b = x;
            }
            else if(x > c && x != a && x != b)
                c = x;
        }
        return c == Long.MIN_VALUE ? (int)a : (int)c;
    }
}
