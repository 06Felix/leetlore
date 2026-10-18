class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> st = new ArrayDeque<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    st.offer(st.pollLast() + st.pollLast());
                    break;
                case "-":
                    st.offer(-st.pollLast() + st.pollLast());
                    break;
                case "*":
                    st.offer(st.pollLast() * st.pollLast());
                    break;
                case "/":
                    int b = st.pollLast();
                    int a = st.pollLast();
                    st.offer(a / b);
                    break;
                default:
                    st.offer(Integer.parseInt(token));
            }
        }
        return st.poll();
    }
}
