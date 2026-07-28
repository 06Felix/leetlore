class Solution {
  public int minimumBuckets(String street) {
    char[] A = street.toCharArray();
    for (int i = 0; i < A.length; ++i)
      if (A[i] == 'H') {
        if (i > 0 && A[i - 1] == 'B')
          continue;
        if (i + 1 < A.length && A[i + 1] == '.')
          A[i + 1] = 'B';
        else if (i > 0 && A[i - 1] == '.')
          A[i - 1] = 'B';
        else
          return -1;
      }
    int ans = 0;
    for(char ch : A)
        if(ch == 'B')
            ans++;
    return ans;
  }
}
