class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int n = heaters.length;
        int ans = 0;
        for(int h : houses){
            int id = Arrays.binarySearch(heaters, h);
            if(id < 0)
                id = -id - 1;
            int d1 = id > 0 ? h - heaters[id - 1] : Integer.MAX_VALUE;
            int d2 = id < n ? heaters[id] - h : Integer.MAX_VALUE;
            ans = Math.max(ans, Math.min(d1, d2));
        }
        return ans;
    }
}
