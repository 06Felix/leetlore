class Solution {
    private int enc(int x){
        int ct = 0;
        int dig = 0;
        while(x > 0){
            dig = Math.max(dig,x%10);
            x /= 10;
            ct++;
        }
        return Integer.parseInt(String.valueOf(dig).repeat(ct));
    }
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(int num : nums)
            ans += enc(num);
        return ans;
    }
}
