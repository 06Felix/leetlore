class Solution {
    public int subarrayGCD(int[] nums, int req) {
        int ans = 0;
        int n = nums.length;
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                int gd = nums[i];
                for(int k = i + 1 ; k <= j ; k++)
                    gd = gcd(gd, nums[k]);
                if(gd < req)
                    break;
                else if(gd == req)
                    ans++;
            }
        }
        return ans;
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
