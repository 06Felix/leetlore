class Solution {
    public int fillCups(int[] amount) {
        int mx = 0, sum = 0;
        for(int x : amount){
            mx = Math.max(mx, x);
            sum += x;
        }
        return Math.max(mx, (sum + 1) / 2);
    }
}
