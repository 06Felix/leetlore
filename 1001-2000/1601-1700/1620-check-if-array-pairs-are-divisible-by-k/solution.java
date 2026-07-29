class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] ct = new int[k];
        for(int x : arr)
            ct[(x % k + k) % k]++;
        if(ct[0] % 2 != 0)
            return false;
        for(int i = 1 ; i <= k / 2 ; i++)
            if(ct[i] != ct[k - i])
                return false;
        return true;
    }
}
