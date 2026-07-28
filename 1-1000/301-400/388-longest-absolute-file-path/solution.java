class Solution {
    public int lengthLongestPath(String input) {
        int ans = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 0);

        String[] lines = input.split("\n");

        for (String line : lines) {
            String name = line.replaceAll("\t", "");
            int depth = line.length() - name.length();
            if (name.contains("."))
                ans = Math.max(ans, m.get(depth) + name.length());
            else
                m.put(depth + 1, m.get(depth) + name.length() + 1);
        }

        return ans;
    }
}
