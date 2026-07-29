class Solution {
  public String complexNumberMultiply(String a, String b) {
    int[] A = get(a);
    int[] B = get(b);
    return String.valueOf(A[0] * B[0] - A[1] * B[1]) + "+" +
        String.valueOf(A[0] * B[1] + A[1] * B[0]) + "i";
  }

  private int[] get(String s) {
    String real = s.substring(0, s.indexOf('+'));
    String img = s.substring(s.indexOf('+') + 1, s.length() - 1);
    return new int[] {Integer.valueOf(real), Integer.valueOf(img)};
  }
}
