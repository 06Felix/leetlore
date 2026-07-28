class Solution {
  public String originalDigits(String s) {
    StringBuilder sb = new StringBuilder();
    int[] ct = new int[10];
    for (char c : s.toCharArray()) {
      if (c == 'z')
        ++ct[0];
      else if (c == 'o')
        ++ct[1];
      else if (c == 'w')
        ++ct[2];
      else if (c == 'h')
        ++ct[3];
      else if (c == 'u')
        ++ct[4];
      else if (c == 'f')
        ++ct[5];
      else if (c == 'x')
        ++ct[6];
      else if (c == 's')
        ++ct[7];
      else if (c == 'g')
        ++ct[8];
      else if (c == 'i')
        ++ct[9];
    }
    ct[1] -= ct[0] + ct[2] + ct[4];
    ct[3] -= ct[8];
    ct[5] -= ct[4];
    ct[7] -= ct[6];
    ct[9] -= ct[5] + ct[6] + ct[8];
    for (int i = 0; i < 10; ++i)
      for (int j = 0; j < ct[i]; ++j)
        sb.append(i);
    return sb.toString();
  }
}
