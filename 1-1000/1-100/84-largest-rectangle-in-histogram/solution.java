class Solution {
    public int largestRectangleArea(int[] heights) {
        int ans = 0;
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= n; ++i) {
            while (!stack.isEmpty() && (i == n || heights[stack.peek()] > heights[i])) {
                int h = heights[stack.pop()];
                int w = stack.isEmpty() ? i : i - stack.peek() - 1;
                ans = Math.max(ans, h * w);
            }
            stack.push(i);
        }
        return ans;
    }
}
