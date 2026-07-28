class Solution {
  public int[] countPoints(int[][] points, int[][] queries) {
    int[] ans = new int[queries.length];
    for (int i = 0; i < queries.length; ++i) {
      int xj = queries[i][0];
      int yj = queries[i][1];
      int rj = queries[i][2];
      int ct = 0;
      for (int[] point : points) {
        int xi = point[0];
        int yi = point[1];
        if (Math.pow(xi - xj, 2) + Math.pow(yi - yj, 2) <= rj * rj)
          ++ct;
      }
      ans[i] = ct;
    }
    return ans;
  }
}
