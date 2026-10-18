class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] ans = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        int prevTime = -1;
        for (String log : logs) {
            String[] splits = log.split(":");
            int id = Integer.parseInt(splits[0]);
            char label = splits[1].charAt(0);
            int timestamp = Integer.parseInt(splits[2]);
            if (label == 's') {
                if (!stack.isEmpty())
                    ans[stack.peek()] += timestamp - prevTime;
                stack.push(id);
                prevTime = timestamp;
            } else {
                ans[stack.pop()] += timestamp - prevTime + 1;
                prevTime = timestamp + 1;
            }
        }
        return ans;
    }
}
