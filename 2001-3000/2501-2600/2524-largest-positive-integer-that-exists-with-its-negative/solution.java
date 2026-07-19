class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;
        int[] ct = new int[1001];
        for(int n : nums){
            int ab = n > 0 ? n : -n; 
            if(ct[ab] != n) ct[ab] += n;
            if(ct[ab] == 0) ans = ans > ab ? ans : ab;
        }
        return ans;
    }
}
