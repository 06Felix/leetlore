class Solution {
  public boolean isAdditiveNumber(String num) {
    int n = num.length();
    for (int i = 0; i < n / 2; ++i) {
      if (i > 0 && num.charAt(0) == '0')
        return false;
      long firstNum = Long.parseLong(num.substring(0, i + 1));
      for (int j = i + 1; Math.max(i, j - i) < n - j; ++j) {
        if (j > i + 1 && num.charAt(i + 1) == '0')
          break;
        long secondNum = Long.parseLong(num.substring(i + 1, j + 1));
        if (dfs(num, firstNum, secondNum, j + 1))
          return true;
      }
    }
    return false;
  }

  private boolean dfs(String num, long firstNum, long secondNum, long s) {
    if (s == num.length())
      return true;
    long thirdNum = firstNum + secondNum;
    String thirdNumStr = String.valueOf(thirdNum);
    return num.indexOf(thirdNumStr, (int) s) == s &&
        dfs(num, secondNum, thirdNum, s + thirdNumStr.length());
  }
}
