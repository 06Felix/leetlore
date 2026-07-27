class Solution {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        int n = energyDrinkA.length;
        
        if (n == 0) return 0;
        
        long[] dpA = new long[n];
        long[] dpB = new long[n];
        
        dpA[0] = energyDrinkA[0];
        dpB[0] = energyDrinkB[0];
        
        for (int i = 1; i < n; i++) {
            dpA[i] = energyDrinkA[i] + Math.max(dpA[i - 1], i > 1 ? dpB[i - 2] : 0);
            dpB[i] = energyDrinkB[i] + Math.max(dpB[i - 1], i > 1 ? dpA[i - 2] : 0);
        }
        
        return Math.max(dpA[n - 1], dpB[n - 1]);
    }

}
