class Solution {
  public String getHint(String secret, String guess) {
    int x = 0;
    int y = 0;
    int[] c1 = new int[10];
    int[] c2 = new int[10];
    for (int i = 0; i < secret.length();i++){
      if (secret.charAt(i) == guess.charAt(i))
        x++;
      else {
        c1[secret.charAt(i) - '0']++;
        c2[guess.charAt(i) - '0']++;
      }
    }
    for (int i = 0; i < 10;i++)
      y += Math.min(c1[i], c2[i]);

    return String.valueOf(x) + "A" + String.valueOf(y) + "B";
  }
}
