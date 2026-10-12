class Solution {
    static {
        for (int i = 0; i < 32; i++)
            numOfUnplacedFruits(new int[0], new int[0]);
    }
    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = baskets.length;
        boolean[] vis = new boolean[n];
        int ans = 0;
        for(int x : fruits){
            boolean fn = false;
            for(int i = 0 ; i < n ; i++){
                if(baskets[i] >= x && !vis[i]){
                    vis[i] = true;
                    fn = true;
                    break;
                }
            }
            if(!fn)
                ans++;
        }
        return ans;
    }
}
