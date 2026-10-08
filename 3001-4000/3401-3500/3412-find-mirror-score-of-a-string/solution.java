class Solution {
    public long calculateScore(String s) {
        int n = s.length();
        Stack<Integer>[] arr = new Stack[26];
        long ans = 0;
        for(int i = 0 ; i < 26 ; i++)
            arr[i] = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            int cur = s.charAt(i) - 'a';
            int opp = 25 - cur;
            if(!arr[opp].isEmpty())
                ans += i - arr[opp].pop();
            else
                arr[cur].push(i);
        }
        return ans;
    }
}
