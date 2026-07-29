class Solution {
    public int diagonalPrime(int[][] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0, j = 0 ; i < n ; i++, j++)
            if(prime(nums[i][j]))
                ans = Math.max(ans, nums[i][j]);
        for(int i = 0, j = n - 1 ; i < n ; i++, j--)
            if(prime(nums[i][j]))
                ans = Math.max(ans, nums[i][j]);
        return ans;
    }
    private boolean prime(int n){
        if(n <= 1)
            return false;
        if(n == 2)
            return true;
        if(n % 2 == 0)
            return false;
        for(int i = 3 ; i <= (int)Math.sqrt(n) ; i += 2)
            if(n % i == 0)
                return false;
        return true;
    }
}
