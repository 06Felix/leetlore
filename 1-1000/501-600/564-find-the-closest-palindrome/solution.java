class Solution {
  public String nearestPalindromic(String n) {
    long[] p = getP(n);
    return Math.abs(p[0] - Long.parseLong(n)) <= Math.abs(p[1] - Long.parseLong(n))
        ? String.valueOf(p[0])
        : String.valueOf(p[1]);
  }

  private long[] getP(String s) {
    long num = Long.parseLong(s);
    int len = s.length();
    long[] p = new long[2];
    String h = s.substring(0, (len + 1) / 2);
    String rh = new StringBuilder(h.substring(0, len / 2)).reverse().toString();
    long cand = Long.parseLong(h + rh);

    if (cand < num)
      p[0] = cand;
    else {
      String ph = String.valueOf(Long.parseLong(h) - 1);
      String rph = new StringBuilder(ph.substring(0, Math.min(ph.length(), len / 2))).reverse().toString();
      if (len % 2 == 0 && Long.parseLong(ph) == 0)
        p[0] = 9;
      else if (len % 2 == 0 && ph.equals("9"))
        p[0] = Long.parseLong(ph + '9' + rph);
      else
        p[0] = Long.parseLong(ph + rph);
    }

    if (cand > num)
      p[1] = cand;
    else {
      String nh = String.valueOf(Long.parseLong(h) + 1);
      String rnh = new StringBuilder(nh.substring(0, len / 2)).reverse().toString();
      p[1] = Long.parseLong(nh + rnh);
    }

    return p;
  }
}
