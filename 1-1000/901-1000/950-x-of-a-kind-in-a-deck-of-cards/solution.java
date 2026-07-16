class Solution {
  public boolean hasGroupsSizeX(int[] deck) {
    Map<Integer, Integer> count = new HashMap<>();
    int gcd = 0;
    for (int d : deck)
      count.merge(d, 1, Integer::sum);

    for (int value : count.values())
      gcd = Gcd(gcd, value);

    return gcd >= 2;
  }

  private int Gcd(int a, int b) {
    return b > 0 ? Gcd(b, a % b) : a;
  }
}
