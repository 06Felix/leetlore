class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int[] rm = new int[n];
        Arrays.fill(rm, Integer.MAX_VALUE);
        int[] cm = new int[m];
        for(int i = 0 ; i < n ; i++)
            for(int j = 0 ; j < m ; j++){
                rm[i] = Math.min(rm[i], matrix[i][j]);
                cm[j] = Math.max(cm[j], matrix[i][j]);
            }
        Set<Integer> st = new HashSet<>();
        for(int x : rm)
            st.add(x);
        for(int x : cm)
            if(!st.add(x))
                ans.add(x);
        return ans;
    }
}
