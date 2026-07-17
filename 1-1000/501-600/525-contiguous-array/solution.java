class Solution {
  public int findMaxLength(int[] arr) {
    int ans = 0;
    int pre = 0;
    int n = arr.length;
    for(int i=0 ; i < n ; i++)
        if(arr[i] == 0)
            arr[i] = -1;
    Map<Integer, Integer> m = new HashMap<>();
    m.put(0, -1);
    for (int i = 0; i < n; ++i) {
      pre += arr[i];
      int val = m.getOrDefault(pre,-33);
      if (val != -33)
        ans = Math.max(ans, i - val);
      else
        m.put(pre, i);
    } 
    return ans;
  }
}
