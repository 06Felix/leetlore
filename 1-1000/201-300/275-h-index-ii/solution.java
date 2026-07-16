class Solution {
  public int hIndex(int[] arr) {
    int n = arr.length;
    int l = 0;
    int r = n;
    while (l < r) {
      int m = (l + r) / 2;
      if (arr[m] >= n - m)
        r = m;
      else
        l = m + 1;
    }

    return n - l;
  }
}
