class Solution {
  public int oddCells(int m, int n, int[][] indices) {
    int ans = 0;
    boolean[] r = new boolean[m];
    boolean[] c = new boolean[n];
    for (int[] id : indices) {
      r[id[0]] ^=  true;
      c[id[1]] ^=  true;
    }
    for (int i = 0; i < m; ++i)
      for (int j = 0; j < n; ++j)
        if (r[i] ^ c[j])
          ++ans;

    return ans;
  }
}
