class Solution {
  public boolean validUtf8(int[] data) {
    int flw = 0;
    for (int d : data)
      if (flw == 0) {
        if ((d >> 3) == 0b11110)
          flw = 3;
        else if ((d >> 4) == 0b1110)
          flw = 2;
        else if ((d >> 5) == 0b110)
          flw = 1;
        else if ((d >> 7) == 0b0)
          flw = 0;
        else
          return false;
      }
      else {
        if ((d >> 6) != 0b10)
          return false;
        --flw;
      }
    return flw == 0;
  }
}
