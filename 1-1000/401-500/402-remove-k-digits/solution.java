class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k)
            return "0";
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray()){
            while(!st.isEmpty() && k > 0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k-- > 0)
            st.pop();
        Collections.reverse(st);
        while(st.size() > 1 && st.peek() == '0')
            st.pop();
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
}
