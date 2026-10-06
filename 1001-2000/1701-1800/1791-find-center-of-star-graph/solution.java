class Solution {
    public int findCenter(int[][] edges) {
        int[] ct = new int[edges.length + 1];
        for(int[] edge : edges)
            for(int n : edge){
                ct[n - 1]++;
                if(ct[n - 1] == edges.length)
                    return n;
            }
        return 1193;
    }
}
