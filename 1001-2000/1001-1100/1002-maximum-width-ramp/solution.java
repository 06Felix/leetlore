class Solution {
  public int maxWidthRamp(int[] nums) {
    int ans = 0;
    Deque<Integer> st = new ArrayDeque<>();
    for (int i = 0; i < nums.length; ++i)
      if (st.isEmpty() || nums[i] < nums[st.peek()])
        st.push(i);
    for (int i = nums.length - 1; i > ans; --i)
      while (!st.isEmpty() && nums[i] >= nums[st.peek()])
        ans = Math.max(ans, i - st.pop());
    return ans;
  }
}
