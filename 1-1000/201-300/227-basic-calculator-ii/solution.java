class Solution {
    public int calculate(String s) {
        char prevOperation = '+';
        int curNum = 0;
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            } else if (c == '+' || c == '*' || c == '/' || c == '-') {
                if (prevOperation == '+') {
                    stack.push(curNum);
                } else if (prevOperation == '-') {
                    stack.push(-curNum);
                } else if (prevOperation == '*') {
                    stack.push(stack.pop() * curNum);
                } else {
                    stack.push(stack.pop() / curNum);
                }
                curNum = 0;
                prevOperation = c;
            } else {
                curNum = curNum * 10 + c - '0';
            }
        }
        if (prevOperation == '*') {
            stack.push(stack.pop() * curNum);
        } else if (prevOperation == '/') {
            stack.push(stack.pop() / curNum);
        } else if (prevOperation == '-') {
            stack.push(-curNum);
        } else {
            stack.push(curNum);
        }

        int ans = 0;
        while (!stack.isEmpty()) {
            ans += stack.pop();
        }

        return ans;
    }
}
