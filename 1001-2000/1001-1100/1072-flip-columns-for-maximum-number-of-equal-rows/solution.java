class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> m = new HashMap<>();
        int n = matrix[0].length;
        int ans = 0;
        for(int[] arr : matrix){
            StringBuilder sb = new StringBuilder();
            for(int i = 0 ; i < n ; i++)
                if(arr[0] == arr[i])
                    sb.append("1");
                else
                    sb.append("0");
            String cur = sb.toString();
            m.merge(cur, 1, Integer :: sum);
            // System.out.println(sb.toString());
            ans = Math.max(ans, m.get(cur));
        }
        return ans;
    }
}
