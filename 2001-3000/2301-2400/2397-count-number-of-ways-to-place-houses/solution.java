class Solution {
    public int countHousePlacements(int n) {
        long[] arr = new long[n + 1];
        if(n == 1)
            return 4;
        if(n == 2)
            return 9;
        arr[1] = 2;
        arr[2] = 3;
        for(int i = 3 ; i <= n ; i++)
            arr[i] = (arr[i - 1] + arr[i - 2]) % 1000000007;
        return (int)((arr[n] * arr[n]) % 1000000007) ;
    }
}
