class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(String l : logs)
            if(l.equals("../"))
                ans = Math.max(0, ans - 1);
            else if(l.equals("./"))
                continue;
            else
                ans++;
        return ans;
    }
}
