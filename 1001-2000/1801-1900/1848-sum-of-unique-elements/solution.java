class Solution {
    public int sumOfUnique(int[] nums) {
        int[] ct = new int[101];
        int ans = 0;
        for(int x : nums)
            ct[x]++;
        for(int i = 1 ; i <= 100 ; i++)
            if(ct[i] == 1)
                ans += i;
        return ans;
    }
}
