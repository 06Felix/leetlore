class Solution {
    public int countBeautifulPairs(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            int fd = String.valueOf(nums[i]).charAt(0) - '0';
            for(int j = i + 1 ; j < n ; j++)
                if(gcd(nums[j] % 10, fd) == 1)
                    ans++;
        }
        return ans;
    }
    private int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
