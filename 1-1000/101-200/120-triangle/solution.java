class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        int n = t.size();
        int[] mem = new int[n];
        List<Integer> last = t.get(n - 1);
        for(int i = 0 ; i < n ; i++)
            mem[i] = last.get(i);
        for(int i = n - 2 ; i >= 0 ; i--){
            List<Integer> curr = t.get(i);
            for(int j = 0 ; j < i + 1 ; j++)
                mem[j] = curr.get(j) + Math.min(mem[j], mem[j + 1]);
        }
        return mem[0];
    }
}
