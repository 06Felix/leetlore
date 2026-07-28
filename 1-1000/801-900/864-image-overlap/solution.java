class Solution {
  public int largestOverlap(int[][] img1, int[][] img2) {
    int n = img1.length;
    int ans = 0;
    List<int[]> o1 = new ArrayList<>();
    List<int[]> o2 = new ArrayList<>();
    Map<Integer, Integer> m = new HashMap<>();
    for (int i = 0; i < n; ++i)
      for (int j = 0; j < n; ++j){
        if (img1[i][j] == 1)
          o1.add(new int[] {i, j});
        if (img2[i][j] == 1)
          o2.add(new int[] {i, j});
      }
    for (int[] a : o1)
      for (int[] b : o2) {
        int key = (a[0] - b[0]) * 100 + a[1] - b[1];
        m.merge(key, 1, Integer::sum);
      }
    for (int ct : m.values())
      ans = Math.max(ans, ct);
    return ans;
  }
}
