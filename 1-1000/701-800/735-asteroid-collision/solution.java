class Solution {
  public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> s = new Stack<>();

    for (int a : asteroids)
      if (a > 0) 
        s.push(a);
      else {
        while (!s.isEmpty() && s.peek() > 0 && s.peek() < -a)
          s.pop();
        if (s.isEmpty() || s.peek() < 0)
          s.push(a);
        else if (s.peek() == -a)
          s.pop();
      }
    int n = s.size();
    int[] ans = new int[n];
    for(int i = n - 1 ; i >= 0 ; i--)
        ans[i] = s.pop();
    return ans;
  }
}
