class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        int m = queries.length;
        int[] ans = new int[m];
        int id = 0;
        Map<Integer, Integer> c2n = new HashMap<>();
        Map<Integer, Integer> n2c = new HashMap<>();
        for(int[] q : queries){
            int x = q[0];
            int y = q[1];
            c2n.merge(y, 1, Integer :: sum);
            int prevCol = n2c.getOrDefault(x, 0);
            if(prevCol != 0){
                c2n.merge(prevCol, -1, Integer :: sum);
                if(c2n.get(prevCol) == 0)
                    c2n.remove(prevCol);
            }
            n2c.put(x, y);
            ans[id++] = c2n.size();
        }
        return ans;
    }
}
