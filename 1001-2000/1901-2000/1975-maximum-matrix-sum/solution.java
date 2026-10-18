class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long sum = 0;
        int mn = Integer.MAX_VALUE;
        int neg = 0;
        for(int[] row : matrix)
            for(int x : row){
                int y = Math.abs(x);
                sum += y;
                mn = Math.min(mn, y);
                if(x < 0)
                    neg ^= 1;
            }
        return sum - neg * mn * 2;
    }
}
