class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int ans = 0;
        for(int[] p : points){
            Map<Integer, Integer> m = new HashMap<>();
            for(int[] q : points)
                m.merge((int)dist(p, q), 1, Integer::sum);
            for(int x : m.values())
                ans += x * (x - 1);
        }
        return ans;
    }
    private double dist(int[] a, int[] b){
        return Math.pow(a[0] - b[0], 2) + Math.pow(a[1] - b[1], 2);
    }
}
