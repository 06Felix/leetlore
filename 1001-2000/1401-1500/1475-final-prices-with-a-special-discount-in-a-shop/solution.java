class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = prices.clone();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!st.isEmpty() && prices[i] <= prices[st.peek()])
                ans[st.pop()] -= prices[i];
            st.push(i);
        }
        return ans;
    }
}
