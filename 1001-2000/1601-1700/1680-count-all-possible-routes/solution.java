class Solution {
    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        Integer[][] memo = new Integer[locations.length][fuel + 1];
        return count(locations, start, finish, fuel, memo);
    }
    private int count(int[] loc, int i, int f, int fuel, Integer[][] memo){
        if(fuel < 0)
            return 0;
        if(memo[i][fuel] != null)
            return memo[i][fuel];
        int ans = (i == f) ? 1 : 0;
        for(int j = 0 ; j < loc.length ; j++){
            if(j != i){
                ans += count(loc, j, f, fuel - Math.abs(loc[i] - loc[j]), memo);
                ans %= 1000000007;
            }
        }
        return memo[i][fuel] = ans;
    }
}
